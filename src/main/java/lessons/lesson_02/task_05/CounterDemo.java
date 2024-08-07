package lessons.lesson_02.task_05;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread increment = new Thread(new MyRunnableIncrement(counter));
        Thread decrement = new Thread(new MyRunnableDecrement(counter));

//        increment.start();
        decrement.start();

//        increment.join();
//        decrement.join();

//        Thread.sleep(1);
        System.out.println("Counter: " + counter.getCount());
    }
}
