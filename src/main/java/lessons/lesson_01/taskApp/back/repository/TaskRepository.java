package lessons.lesson_01.taskApp.back.repository;

import lessons.lesson_01.taskApp.back.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TaskRepository implements InMemoryRepository {
    private final List<Task> dataBase;
    private Integer taskIdCounter = 0;

    public TaskRepository() {
        this.dataBase = new ArrayList<>();
    }

    private Integer generateId() {
        return ++taskIdCounter;
    }

    @Override
    public Task addTask(Task task) {

        var id = generateId();
        Task taskForSave = new Task(id, task.getTaskName(), task.getTaskDescription());
        dataBase.add(taskForSave);
        return taskForSave;

    }

    @Override
    public Optional<Task> findById(Integer id) {
        return dataBase.stream()
                .filter(task -> task.getTaskId().equals(id))
                .findFirst();
    }

    @Override
    public List<Task> findAll() {

        return dataBase;
    }

    @Override
    public List<Task> findByName(String name) {

        return dataBase.stream()
                .filter(task -> task.getTaskName().equals(name))
                .toList();

    }

    @Override
    public Boolean deleteTaskById(Integer id) {
        boolean isDeleted;
        Optional<Task> taskForDelete = dataBase.stream()
                .filter(task -> task.getTaskId().equals(id))
                .findFirst();
        isDeleted = taskForDelete.map(dataBase::remove).orElse(false);
        return isDeleted;
    }


    @Override
    public Optional<Task> updateTask(Integer id, String newDescription) {
        updateTaskDescriptionById(id, newDescription);
        return dataBase.stream()
                .filter(task -> task.getTaskId().equals(id))
                .findFirst();
    }

    private void updateTaskDescriptionById(Integer id, String newDescription) {
        for (Task task : dataBase) {
            if (Objects.equals(task.getTaskId(), id)) {
                task.setTaskDescription(newDescription);
            }
        }
    }


}

