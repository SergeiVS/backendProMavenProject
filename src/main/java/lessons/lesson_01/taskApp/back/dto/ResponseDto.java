package lessons.lesson_01.taskApp.back.dto;

import lessons.lesson_01.taskApp.back.service.validation.validationRules.CoreError;

import java.util.List;

public class ResponseDto <T> {

    private T result;
    private List<CoreError> errors;

    public ResponseDto(T result, List<CoreError> listErrors) {
        this.result = result;
        this.errors = listErrors;
    }

    public T getResult() {
        return result;
    }

    public List<CoreError> getErrors() {
        return errors;
    }
}
