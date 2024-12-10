package lesson20241015.copying;

public class Box implements Cloneable {

     private String name;
     private boolean canBeSold;
     private int count;
     private Cat cat;

     public Box(String name, boolean canBeSold, int count, Cat cat) {
          this.name = name;
          this.canBeSold = canBeSold;
          this.count = count;
          this.cat = cat;
     }

     public void empty() {
          cat = null;
          name = null;
          canBeSold = false;
          count = 0;
      }
      public Box makeCopy() {
           return new Box(name, canBeSold, count, cat);
      }
      public Box deepCopy() {
          return new Box(name, canBeSold, count, new Cat(cat.getName(), cat.getAge(), cat.getColour()));
      }

    public static void main(String[] args) {
        Cat cat = new Cat("My Cat", 2, "grey");
        Box box = new Box("Box", true, 12, cat);

//        Box box2 = box.makeCopy();
        Box box2 = box.deepCopy();
        System.out.println(box.cat == box2.cat);
        box2.cat.setName("Box 2 cat");

        System.out.println(box);

        try {
            Cat clonedCat = (Cat) cat.clone();
            System.out.println(clonedCat);

            Box clonedBox = (Box) box.clone();
            System.out.println(clonedBox);

            System.out.println(box.cat == clonedBox.cat);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone operation not supported");
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", canBeSold=" + canBeSold +
                ", count=" + count +
                ", cat=" + cat +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // deep copy
        Box clone = (Box) super.clone(); // shallow copy
        Cat clonedCat = (Cat) this.cat.clone();
        clone.cat = clonedCat;
        return clone;
    }
}
