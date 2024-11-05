package lesson20241105.hashcode;

public class HashCodeExamples {

    public static void main(String[] args) {
        Integer integer = -10;

        System.out.println(integer.hashCode());

        Character a = 'a';
        System.out.println(a.hashCode());
        Character b = 'b';
        System.out.println(b.hashCode());

        String string ="abc";
        System.out.println(string.hashCode());
        string = "abd";
        System.out.println(string.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("bbc".hashCode());
    }


}
