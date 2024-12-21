package tms.lesson9.domain;

public class User {

    private final Dog test;

    public User(String test) {
        this.test = new Dog("");
    }

    public User() {
        this.test = new Dog("");
    }

    public void change() {
        test.setAge(10);
    }
}
