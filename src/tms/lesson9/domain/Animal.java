package tms.lesson9.domain;

public class Animal extends Object implements LifeService {

    public Animal() {
        System.out.println("Animal");
    }

    public String name;

    private String namePrivate;

    protected String nameProtected;

    String nameDefault;

    void testDefault() {
        System.out.println("testDefault");
    }

    public void testPublic() {
        System.out.println("testPublic");
    }

    protected void testProtected() {
        System.out.println("testProtected");
    }

    private void testPrivate() {
        System.out.println("testPublic");
    }

    public void move() {
        testPublic();
        System.out.println(name);
        testPrivate();
        System.out.println(namePrivate);
        System.out.println("animal moved");
    }

    public void eat() {
        System.out.println("Animal ate");
    }

}
