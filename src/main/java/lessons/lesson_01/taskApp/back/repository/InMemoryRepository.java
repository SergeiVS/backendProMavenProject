package lessons.lesson_01.taskApp.back.repository;

import lessons.lesson_01.taskApp.back.entity.Task;

import java.util.Optional;
import java.util.List;

public interface InMemoryRepository {

    Task addTask(Task task);


    Optional<Task> findById(Integer id);

    List<Task> findAll();

    List<Task> findByName(String name);

    Boolean deleteTaskById(Integer id);

    Optional<Task> updateTask(Integer id, String newDescription);
}
