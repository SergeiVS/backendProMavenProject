package lessons.lesson_01.taskApp.back.service.validation;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
