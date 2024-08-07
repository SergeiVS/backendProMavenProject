package lessons.lesson_01.taskApp.back.service;

import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.dto.ResponseDto;
import lessons.lesson_01.taskApp.back.entity.Task;
import lessons.lesson_01.taskApp.back.repository.InMemoryRepository;
import lessons.lesson_01.taskApp.back.service.validation.ValidationService;
import lessons.lesson_01.taskApp.back.service.validation.validationRules.CoreError;

import java.util.List;
import java.util.Optional;

public class UpdateDescriptionService {

    private final InMemoryRepository repository;

    private final ValidationService validationService;

    public UpdateDescriptionService(InMemoryRepository repository, ValidationService validation) {
        this.repository = repository;
        this.validationService = validation;
    }

    public ResponseDto<Task> updateDescriptionService(Integer id, String newDescription) {
        List<CoreError> errors = validationService.validation(new RequestDto("task for validate", newDescription));
        Optional<Task> updatedTask;

        if (errors.isEmpty()) {
            updatedTask = repository.updateTask(id, newDescription);
        } else {
            return new ResponseDto<>(new Task(), errors);
        }

        if (updatedTask.isEmpty()) {
            errors.add(new CoreError("Task with id = " + id + " not found"));
            return new ResponseDto<>(new Task(), errors);
        }

        return new ResponseDto<>(updatedTask.get(), errors);
    }
}
