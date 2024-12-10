package lesson20241001;

import java.util.Objects;

public class BlackCat extends Cat {

    private String colour;

    public BlackCat(String name, int age) {
        super(name, age);
        colour = "Black";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlackCat blackCat = (BlackCat) o;
        return Objects.equals(colour, blackCat.colour);
    }

}
