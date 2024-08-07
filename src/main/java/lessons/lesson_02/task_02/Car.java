package lessons.lesson_02.task_02;

public class Car extends Thread{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        System.out.println(model + " driven by Thread: " + Thread.currentThread().getName());
    }
}
