package lessons.lesson_01.taskApp.back.service.validation;

import lessons.lesson_01.taskApp.back.service.validation.validationRules.ValidationRule;
import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.service.validation.validationRules.CoreError;
import lessons.lesson_01.taskApp.back.service.validation.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class ValidationService {

    private List<ValidationRule> validationRules;

    public ValidationService(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }

    public List<CoreError> validation(RequestDto request){
        List<CoreError> errors = new ArrayList<>();

        if (request == null) {
            errors.add(new CoreError("Task request must be not null"));
            return errors;
        }

        for (ValidationRule rule : validationRules) {
            try {
                rule.validate(request);
            } catch (ValidationException e) {
                errors.add(new CoreError(e.getMessage()));
            }
        }

        return errors;
    }
}
