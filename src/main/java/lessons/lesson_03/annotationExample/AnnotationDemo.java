package lessons.lesson_03.annotationExample;

public class AnnotationDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        testInterface(parent);
        testInterface(child);

        testAnnotation(parent);
        testAnnotation(child);

    }

    static void testInterface(MyMark markedObj) {
        System.out.println("testInterface was successful");
    }

    static void testAnnotation(Object object) {
        if (!object.getClass().isAnnotationPresent(MyAnnotation.class)) {
            throw new RuntimeException("Object: " + object.getClass().getName() + " has not annotation");
        } else {
            System.out.println("Object: " + object.getClass().getName() + " has annotation");
        }
    }
}
