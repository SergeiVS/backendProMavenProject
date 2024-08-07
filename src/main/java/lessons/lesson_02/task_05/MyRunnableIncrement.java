package lessons.lesson_02.task_05;

public class MyRunnableIncrement implements Runnable {

    private final Counter count;

    public MyRunnableIncrement(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            count.increment();

        }

    }
}
