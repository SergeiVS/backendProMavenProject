package lessons.lesson_01.taskApp.back.service;

import lessons.lesson_01.taskApp.back.dto.ResponseDto;
import lessons.lesson_01.taskApp.back.repository.InMemoryRepository;
import lessons.lesson_01.taskApp.back.repository.TaskRepository;
import lessons.lesson_01.taskApp.back.service.validation.validationRules.CoreError;

import java.util.ArrayList;
import java.util.List;

public class DeleteTaskService {

    private final InMemoryRepository repository;


    public DeleteTaskService(InMemoryRepository repositoty) {
        this.repository = repositoty;
    }

    public ResponseDto<Boolean> deleteTaskService(Integer id) {
        List<CoreError> errors = new ArrayList<>();
        if (id == null) {
            errors.add(new CoreError("Task delete fault, while id is null"));
            return new ResponseDto<>(false, errors);
        }
        var result = repository.deleteTaskById(id);

        if (!result) {
            errors.add(new CoreError("Task delete fault, no Task with such ID"));
        }
        return new ResponseDto<>(result, errors);
    }

}
