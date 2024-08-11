package org.xmlConfig.xmlExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansV1.xml");
        HelloWorld objectA = (HelloWorld) context.getBean("helloWorld");

        System.out.println(objectA.getMessage());
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(objB.getMessage());

        System.out.println();

        objB.setMessage("New Message");

        System.out.println(objectA.getMessage());
        System.out.println(objB.getMessage());
    }
}
