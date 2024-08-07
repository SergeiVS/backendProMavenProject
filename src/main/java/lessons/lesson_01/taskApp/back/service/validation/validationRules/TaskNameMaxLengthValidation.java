package lessons.lesson_01.taskApp.back.service.validation.validationRules;

import lessons.lesson_01.taskApp.back.service.validation.ValidationException;
import lessons.lesson_01.taskApp.back.dto.RequestDto;


public class TaskNameMaxLengthValidation implements ValidationRule{

    @Override
    public void validate(RequestDto request) {
        if (request.getTaskName().length() > 30) {
            throw new ValidationException("Task name length must be less than 30 characters, but actual name length is " + request.getTaskName().length());
        }
    }
}
