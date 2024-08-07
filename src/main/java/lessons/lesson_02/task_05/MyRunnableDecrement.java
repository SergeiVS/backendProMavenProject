package lessons.lesson_02.task_05;

public class MyRunnableDecrement implements Runnable{

    private final Counter counter;

    public MyRunnableDecrement(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            counter.decrement();
        }
    }
}
