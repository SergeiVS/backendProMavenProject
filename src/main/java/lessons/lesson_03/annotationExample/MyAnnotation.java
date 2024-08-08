package lessons.lesson_03.annotationExample;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
}
