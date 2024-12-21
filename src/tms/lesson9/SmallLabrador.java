package tms.lesson9;

import tms.lesson9.domain.Labrador;

import java.util.Objects;

public class SmallLabrador extends Labrador {

    private String name;
    private int age = 1;

    public SmallLabrador(String name) {
        super(name);
        this.name = name;
        System.out.println("Small Labrador");
    }

    public void test() {
        System.out.println(nameProtected);
        testProtected();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmallLabrador that = (SmallLabrador) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    public void testA() {

    }

}
