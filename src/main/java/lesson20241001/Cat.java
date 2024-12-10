package lesson20241001;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object another) {
//        if (!(another instanceof Cat)) {
//            return false;
//        }
        if (another == null || another.getClass() != this.getClass()) {
            return false;
        }
        Cat anotherCat = (Cat) another;
//        return this.age == anotherCat.age &&
//                (this.name == null ? anotherCat.name == null : this.name.equals(anotherCat.name));
        return this.age == anotherCat.age && Objects.equals(this.name, anotherCat.name);
    }
}
