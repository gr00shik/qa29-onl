package tms.lesson9.domain;

public interface LifeService {

    void move();

    void eat();

    default void test() {
        System.out.println("test");
    }

}
