package lessons.lesson_01.taskApp.back.service.validation.validationRules;

public class CoreError {
    private String message;

    public CoreError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return "CoreError{" +
                "message='" + message + '\'' +
                '}';
    }
}
