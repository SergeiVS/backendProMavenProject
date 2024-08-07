package lessons.lesson_03.reflection;

import java.lang.reflect.Method;

public class Exapmle {
    public static void main(String[] args) {


    Class stringClass = String.class;

    Method[] methods = stringClass.getMethods();

        System.out.println(methods.length);}
}
