package lesson20250116;

public class Data {

    private final String name;
    private int count;

    public Data(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void publicMethod(){
        System.out.println("publicMethod, calls process data: ");
        System.out.println(processData());
    }

    private String processData() {
        return "Data processed from " + this;
    }

    private void privateMethod(String input) {
        System.out.println("privateMethod called with input: " + input);
    }



    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
