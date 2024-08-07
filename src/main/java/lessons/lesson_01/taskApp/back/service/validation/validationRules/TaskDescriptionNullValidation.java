package lessons.lesson_01.taskApp.back.service.validation.validationRules;

import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.service.validation.ValidationException;

public class TaskDescriptionNullValidation implements ValidationRule{
    @Override
    public void validate(RequestDto request) {
        if (request.getTaskDescription() == null || request.getTaskDescription().trim().isEmpty()) {
            throw new ValidationException("Task description must be not null");
        }
    }
}
