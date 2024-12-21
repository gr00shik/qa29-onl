package tms.lesson9.domain;

public class Dog extends Animal implements PlayService {

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //    public Dog() {
//    }

    public Dog(String name) {
        System.out.println("Dog constructor");
    }

    public Dog(String name, int age) {
    }

    @Override
    public final void move() {
        testPublic();
        System.out.println(name);
        testProtected();
        System.out.println(nameProtected);
        testDefault();
        System.out.println(nameDefault);
        System.out.println("Dog moved");
    }

    public void playBall() {
        System.out.println("Dog played");
    }


}
