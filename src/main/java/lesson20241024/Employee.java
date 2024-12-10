package lesson20241024;

public abstract class Employee implements JobActions {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
