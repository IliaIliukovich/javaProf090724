package summary20241011.enumtask;

import java.util.Arrays;

public class Student implements Cloneable {

    private String name;

    private Subject[] subjects;
//    private boolean[] ifKnowsSubject;

    public Student(String name) {
        this.name = name;
        subjects = new Subject[Subject.values().length];
    }


    public void learn(Subject subject) {
        subjects[subject.ordinal()] = subject;
        System.out.println("Student " + name + " learns " + subject);
    }

    public boolean knows(Subject subject) {
        Subject subjectFromArray = subjects[subject.ordinal()];
        return subjectFromArray == subject;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.subjects = subjects.clone();

        return copy;

    }
}
