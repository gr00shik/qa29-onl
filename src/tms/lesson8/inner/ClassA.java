package tms.lesson8.inner;

public class ClassA {

    private Address address;
    private String name;

    public void test() {
        System.out.println("test");
        Address address = new Address();
        address.innerTest();
    }

    public Address getAddress() {
        return address;
    }

    public class Address {

        public void innerTest() {
            System.out.println("InnerClassA.innerTest");
            System.out.println(name);
            test();
        }

    }

}

