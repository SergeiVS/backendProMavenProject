package org.javaConfig.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Context was created");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog", Dog.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println();

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
