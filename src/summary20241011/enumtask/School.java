package summary20241011.enumtask;

import java.util.Arrays;

public class School {

    public static void main(String[] args) throws CloneNotSupportedException {
        Subject subject = Subject.MATH;
        System.out.println(Subject.LITERATURE == subject);

        Teacher teacher1 = new Teacher("Mr. Smith", Subject.MATH);
        Teacher teacher2 = new Teacher("Mrs. Smith", Subject.LITERATURE);

        Student student1 = new Student("Tom");
        Student student2 = new Student("Mary");
        Student student3 = new Student("Lucy");
        Student[] group = {student1, student2, student3};

        teacher1.teach(student1);
        teacher2.teach(group);

        System.out.println(Arrays.toString(group));

        System.out.println(student1.knows(Subject.HISTORY));
        System.out.println(student1.knows(Subject.MATH));
        System.out.println(student1.knows(Subject.LITERATURE));
//
        student1.learn(Subject.MATH);

        // Deep copy
        Student student5 = (Student) student1.clone();

        // Shallow copy
//        Student student5 = student1;
        student5.learn(Subject.HISTORY);

        System.out.println(student1);
        System.out.println(student5);
    }

}
