package lesson20250123.hometask;

import java.lang.reflect.Field;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
    private Student student2;


    public static void main(String[] args) {
        School school = new School();
        System.out.println(school.student1);
        System.out.println(school.student2);

        Injector.inject(school);

        System.out.println(school.student1);
        System.out.println(school.student2);
    }

    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StudentInfo.class)) {
                    StudentInfo annotation = field.getAnnotation(StudentInfo.class);
                    field.setAccessible(true); // should work on private fields
                    try {
                        Student student = new Student(annotation.name(), annotation.surname(), annotation.groupNumber(), annotation.isOnline());
                        field.set(instance, student);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}