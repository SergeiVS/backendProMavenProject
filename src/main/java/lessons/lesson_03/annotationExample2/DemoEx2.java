package lessons.lesson_03.annotationExample2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DemoEx2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<DemoClass> demoClass = DemoClass.class;
        java.lang.annotation.Annotation[] annotations =  demoClass.getAnnotations();

        for (java.lang.annotation.Annotation annotation : annotations) {
            if (annotation instanceof JavaFileInfo javaFileInfo) {
                System.out.println("Author " + javaFileInfo.name());
                System.out.println("Vertion " + javaFileInfo.value());
            }
        }

        Method method = demoClass.getMethod("printString");

        annotations =  method.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof JavaFileInfo javaFileInfo) {
                System.out.println("Author " + javaFileInfo.name());
                System.out.println("Vertion " + javaFileInfo.value());
            }
        }

    }
}
