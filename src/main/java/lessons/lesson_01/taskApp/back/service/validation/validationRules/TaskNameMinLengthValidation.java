package lessons.lesson_01.taskApp.back.service.validation.validationRules;

import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.service.validation.ValidationException;

public class TaskNameMinLengthValidation implements ValidationRule{
    @Override
    public void validate(RequestDto request) {
        if (request.getTaskName().length() < 5) {
            throw new ValidationException("Task name length must be greater than 5 characters, but actual name length is " + request.getTaskName().length());
        }
    }
}
