package lesson20241015.copying;

public class Cat implements Cloneable {

     private String name;
     private int age;
     private String colour;

     public Cat(String name, int age, String colour) {
          this.name = name;
          this.age = age;
          this.colour = colour;
     }

     public String getName() {
          return name;
     }

     public int getAge() {
          return age;
     }

     public String getColour() {
          return colour;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public void setColour(String colour) {
          this.colour = colour;
     }

     @Override
     public String toString() {
          return "Cat{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  ", colour='" + colour + '\'' +
                  '}';
     }

     @Override
     public Object clone() throws CloneNotSupportedException {
          return super.clone();
     }
}
