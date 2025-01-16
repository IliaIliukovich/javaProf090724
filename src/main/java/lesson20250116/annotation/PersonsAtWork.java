package lesson20250116.annotation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@AllArgsConstructor
@NoArgsConstructor
public class PersonsAtWork {

    @Name(name = "Bob", surname = "Smiths", age = 45)
    String person1;

    @Name(name = "Tom", surname = "Smiths", age = 23)
    String person2;

    @Name(surname = "Surname", age = 33)
    String person3;

    @Name(name = "Name", surname = "Surname", age = 99)
    public void method(){

    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PersonsAtWork personsAtWork = new PersonsAtWork();
        PersonsAtWork personsAtWork2 = new PersonsAtWork("Person1", "Person2", "Person3");
        System.out.println(personsAtWork2);

        System.out.println(personsAtWork.person1);
        System.out.println(personsAtWork.person2);
        System.out.println(personsAtWork.person3);

//        Class<? extends PersonsAtWork> personsAtWorkClass = personsAtWork.getClass();
//        Field field = personsAtWorkClass.getDeclaredField("person1");
//        Name annotation = field.getAnnotation(Name.class);
//        System.out.println(annotation.name());
//        field.setAccessible(true);
//        field.set(personsAtWork, annotation.name());
//
//        System.out.println(personsAtWork.person1);
//        System.out.println(personsAtWork.person2);
//        System.out.println(personsAtWork.person3);

        Injector.inject(personsAtWork);

        System.out.println(personsAtWork.person1);
        System.out.println(personsAtWork.person2);
        System.out.println(personsAtWork.person3);
    }

    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Name.class)) {
                    Name annotation = field.getAnnotation(Name.class);
                    field.setAccessible(true); // should work on private fields
                    try {
                        field.set(instance, annotation.name());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "PersonsAtWork{" +
                "person1='" + person1 + '\'' +
                ", person2='" + person2 + '\'' +
                ", person3='" + person3 + '\'' +
                '}';
    }
}
