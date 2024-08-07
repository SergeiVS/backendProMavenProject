package lessons.lesson_02.task_02;

import java.util.TreeMap;

public class CarDemo {
    public static void main(String[] args) throws InterruptedException {
        var mercedes =  new Car("Mercedes");
        var bmw =  new Car("BMW");
       var lamborghini = new Car("Lamborghini");

       mercedes.start();
       bmw.start();
       lamborghini.start();
        Thread.sleep(500);
        System.out.println("Thread: " + Thread.currentThread().getName() + " was stopped");
    }
}
