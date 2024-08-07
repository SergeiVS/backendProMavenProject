package lessons.lesson_02.task_05;

public class Counter {
    private int count = 0;

    public synchronized void increment(){count++;};

    public synchronized void decrement(){count--;};
    public int getCount() {
        return count;
    }
}
