package homeworks.lessonsHomeworks.lesson_03;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SimpleDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Simple simple = new Simple();
        Class<Simple> simpleClass = (Class<Simple>) simple.getClass();

        System.out.println();

        Constructor<Simple> simpleConstructor = simpleClass.getConstructor();
        System.out.println("Constructor of Class Simple:");
        System.out.println(simpleConstructor);

        System.out.println();


        Method[] publicMethods = simpleClass.getMethods();

        System.out.println("Public methods of Class Simple:");
        Arrays.stream(publicMethods).forEach(System.out::println);

        System.out.println();

        Method method2 = simpleClass.getMethod("method2", int.class);
        var x = 5;
        System.out.println("Calling of method 2:");
        method2.invoke(simple, x);

        System.out.println();

        Field str = simpleClass.getDeclaredField("str");
        str.setAccessible(true);
        System.out.println("Variable str default value: " + str.get(simple));
        str.set(simple, "Group ___");
        System.out.println("Variable str new value: " + str.get(simple));


        System.out.println();

        Method method1 = simpleClass.getMethod("method1");

        System.out.println("Calling of method 1:");
        method1.invoke(simple);

        System.out.println();

        Method method3 = simpleClass.getDeclaredMethod("method3");

        System.out.println("Calling of method 3:");
        method3.setAccessible(true);
        method3.invoke(simple);
    }
}
