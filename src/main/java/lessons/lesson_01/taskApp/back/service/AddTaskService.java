package lessons.lesson_01.taskApp.back.service;



import lessons.lesson_01.taskApp.back.repository.InMemoryRepository;
import lessons.lesson_01.taskApp.back.service.validation.ValidationService;
import lessons.lesson_01.taskApp.back.dto.ResponseDto;
import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.entity.Task;
import lessons.lesson_01.taskApp.back.service.validation.validationRules.CoreError;
import java.util.List;

public class AddTaskService {

    private final InMemoryRepository repository;
    private final ValidationService validationService;

    public AddTaskService(InMemoryRepository repository, ValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public ResponseDto<Task> addNewTask(RequestDto request){
        System.out.println("Receive request: " + request);
        // валидация данных
        List<CoreError> errors = validationService.validation(request);
        Task savedTask = null;

        if (errors.isEmpty()) {
            Task taskForSave = new Task(0, request.getTaskName(), request.getTaskDescription());
            savedTask = repository.addTask(taskForSave);
        }

        return new ResponseDto<>(savedTask, errors);
    }
}
