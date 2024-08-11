package org.xmlConfig.xmlExample2;

public class HelloWorld2 {
    public void init() {

        System.out.println("init method in :" + this.getClass().getSimpleName());
    }

    public void destroy() {

        System.out.println("destroy method in :" + this.getClass().getSimpleName());
    }

    public void working() {
        System.out.println("working method in: " + this.getClass().getSimpleName());
    }
}
