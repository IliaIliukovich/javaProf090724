package lesson20250123.hometask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StudentInfo {

    String name();
    String surname();
    int groupNumber();
    boolean isOnline();

}
