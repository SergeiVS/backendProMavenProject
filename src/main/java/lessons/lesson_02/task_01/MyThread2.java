package lessons.lesson_02.task_01;

public class MyThread2 extends Thread {

    @Override
    public void run() {

        for (int i = 10000; i < 10010; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}