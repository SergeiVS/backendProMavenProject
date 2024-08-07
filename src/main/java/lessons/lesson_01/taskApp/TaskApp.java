package lessons.lesson_01.taskApp;

import lessons.lesson_01.taskApp.back.repository.InMemoryRepository;
import lessons.lesson_01.taskApp.back.repository.TaskRepository;
import lessons.lesson_01.taskApp.back.service.AddTaskService;
import lessons.lesson_01.taskApp.back.service.DeleteTaskService;
import lessons.lesson_01.taskApp.back.service.FindTaskService;
import lessons.lesson_01.taskApp.back.service.UpdateDescriptionService;
import lessons.lesson_01.taskApp.back.service.validation.ValidationService;
import lessons.lesson_01.taskApp.back.service.validation.validationRules.*;
import lessons.lesson_01.taskApp.front.ui.TaskAppUI;

import java.util.ArrayList;
import java.util.List;

public class TaskApp {
    public static void main(String[] args) {


        List<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new TaskNameNullValidation());
        validationRules.add(new TaskDescriptionNullValidation());
        validationRules.add(new TaskNameMinLengthValidation());
        validationRules.add(new TaskNameMaxLengthValidation());

        InMemoryRepository repository = new TaskRepository();

        ValidationService validationService = new ValidationService(validationRules);

        AddTaskService addTaskService = new AddTaskService(repository, validationService);
        FindTaskService findTaskService = new FindTaskService(repository);
        UpdateDescriptionService updateDescriptionService = new UpdateDescriptionService(repository, validationService);
        DeleteTaskService deleteTaskService = new DeleteTaskService(repository);
        TaskAppUI taskAppUI = new TaskAppUI(addTaskService, findTaskService, updateDescriptionService, deleteTaskService);
        taskAppUI.run();

    }
}
