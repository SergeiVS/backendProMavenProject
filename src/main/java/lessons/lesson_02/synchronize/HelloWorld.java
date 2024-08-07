package lessons.lesson_02.synchronize;

public class HelloWorld {
    public static void main(String[] args) {
        Object object = new Object();

        synchronized (object) {
            System.out.println("Hello World!");
        }
    }
}
