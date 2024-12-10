package lesson20241022.innerclass;

public class Cat {

    private Kitten kitten;

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setKitten(Kitten kitten) {
        this.kitten = kitten;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kitten=" + kitten +
                ", name='" + name + '\'' +
                '}';
    }

    public class Kitten {
        private String kittenName;

        public Kitten(String kittenName) {
            this.kittenName = kittenName;
        }

        @Override
        public String toString() {
            return "Kitten{" +
                    "kittenName='" + kittenName + '\'' +
                    ", motherName:" + name + '}';
        }
    }



}
