package tms.lesson9.domain;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name, 1);
        System.out.println("Labrador");
    }

    public Labrador(String name, int age) {
        super(name, age);
    }

}
