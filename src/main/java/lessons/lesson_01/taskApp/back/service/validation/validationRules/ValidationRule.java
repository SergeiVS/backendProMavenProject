

package  lessons.lesson_01.taskApp.back.service.validation.validationRules;

import lessons.lesson_01.taskApp.back.dto.RequestDto;

public interface ValidationRule {

    void validate(RequestDto request);

}
