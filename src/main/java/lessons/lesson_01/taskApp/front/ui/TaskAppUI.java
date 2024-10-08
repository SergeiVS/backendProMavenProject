package lessons.lesson_01.taskApp.front.ui;

import lessons.lesson_01.taskApp.back.dto.ResponseDto;
import lessons.lesson_01.taskApp.back.dto.RequestDto;
import lessons.lesson_01.taskApp.back.entity.Task;
import lessons.lesson_01.taskApp.back.service.AddTaskService;
import lessons.lesson_01.taskApp.back.service.DeleteTaskService;
import lessons.lesson_01.taskApp.back.service.FindTaskService;
import lessons.lesson_01.taskApp.back.service.UpdateDescriptionService;

import java.util.List;
import java.util.Scanner;

public class TaskAppUI {
    private final AddTaskService addTaskService;
    private final FindTaskService findTaskService;

    private final UpdateDescriptionService updateDescriptionService;

    private final DeleteTaskService deleteTaskService;
    private final Scanner scanner;

    public TaskAppUI(AddTaskService addTaskService, FindTaskService findTaskService, UpdateDescriptionService updateDescriptionService, DeleteTaskService deleteTaskService) {
        this.addTaskService = addTaskService;
        this.findTaskService = findTaskService;
        this.updateDescriptionService = updateDescriptionService;
        this.deleteTaskService = deleteTaskService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        addNewTask();
                        break;
                    case 2:
                        findAllTasks();
                        break;
                    case 3:
                        findTaskById();
                        break;
                    case 4:
                        findTaskByName();
                        break;
                    case 5:
                        deleteTaskById();
                        break;
                    case 6:
                        updateTask();
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Invalid menu input");
            }
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add new task");
        System.out.println("2. Find all tasks");
        System.out.println("3. Find task by ID");
        System.out.println("4. Find task by name");
        System.out.println("5. Delete task by ID");
        System.out.println("6. Update task");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addNewTask() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        RequestDto request = new RequestDto(name, description);
        ResponseDto<Task> response = addTaskService.addNewTask(request);

        if (response.getErrors().isEmpty()) {
            System.out.println("Task added successfully: " + response.getResult());
        } else {
            response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
        }
    }

    private void findAllTasks() {
        ResponseDto<List<Task>> response = findTaskService.findAll();
        if (response.getErrors().isEmpty()) {
            response.getResult().forEach(System.out::println);
        } else {
            response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
        }
    }

    private void findTaskById() {
        System.out.print("Enter task ID: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());


            ResponseDto<Task> response = findTaskService.findById(id);


            if (response.getErrors().isEmpty()) {
                System.out.println(response.getResult());
            } else {
                response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: inserted ID is not a number.");
        }
    }

    private void findTaskByName() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        ResponseDto<List<Task>> response = findTaskService.findByName(name);
        if (response.getErrors().isEmpty()) {
            response.getResult().forEach(System.out::println);
        } else {
            response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
        }
    }

    private void deleteTaskById() {
        System.out.print("Enter task ID to delete: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());


            ResponseDto<Boolean> response = deleteTaskService.deleteTaskService(id);

            if (response.getErrors().isEmpty() && response.getResult()) {
                System.out.println("Task was deleted");
            } else {
                response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: inserted ID is not a number.");
        }

    }

    private void updateTask() {
        System.out.print("Enter task ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new description for task with " + id + ": ");
        String newDescription = scanner.nextLine();

        ResponseDto<Task> updatedTask = updateDescriptionService.updateDescriptionService(id, newDescription);

        if (updatedTask.getErrors().isEmpty()) {
            System.out.println(updatedTask.getResult());
        } else {
            updatedTask.getErrors().forEach(System.out::println);
        }
    }
}
