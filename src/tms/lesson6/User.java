package tms.lesson6;

public class User {

    public int age;

    public String name;

    public boolean isMan;

    public String nickname;

    public User(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public User(String uName, int uAge, boolean uIsMan, String uNickName) {
        name = uName;
        age = uAge;
        isMan = uIsMan;
        nickname = uNickName;
    }

    public User(int test, boolean test2) {
        System.out.println("Constructor");
    }

    public User() {
        System.out.println("Create user by default constructor");
    }

    public String summery() {
        String summ = "Name: " + name + ", Age: " + age + ", isMan: " + isMan;
        return summ;
    }

}
