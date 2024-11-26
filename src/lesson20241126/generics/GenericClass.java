package lesson20241126.generics;

public class GenericClass <Parameter, M> {

    private Parameter data;

    public GenericClass(Parameter data) {
        this.data = data;
    }

    public Parameter nonStaticMethod() {
        System.out.println(data);
        System.out.println(data.getClass());
        return data;
    }

    public void nonStaticMethod2(Parameter parameter, M m) {
        System.out.println("Input: " + parameter);
        System.out.println(parameter.getClass());
        System.out.println("Input2: " + m);
        System.out.println(m.getClass());
    }

    public <K> Parameter nonStaticGenericMethod(K k) {
       System.out.println(data);
       System.out.println(k);
       return data;
    }



}
