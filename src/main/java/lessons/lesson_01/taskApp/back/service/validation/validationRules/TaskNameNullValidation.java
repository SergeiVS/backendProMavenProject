package lessons.lesson_01.taskApp.back.service.validation.validationRules;

import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.service.validation.ValidationException;

public class TaskNameNullValidation implements ValidationRule {

    @Override
    public void validate(RequestDto request) {
        if (request.getTaskName() == null) {
            throw new ValidationException("Task name must be not null");
        }
    }
}
