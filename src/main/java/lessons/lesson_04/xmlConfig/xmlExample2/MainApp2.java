package org.xmlConfig.xmlExample2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansV2.xml");

        System.out.println("Context is created");

        HelloWorld2 obj1 = (HelloWorld2) context.getBean("helloWorld2");

        obj1.working();

        context.close();
    }
}
