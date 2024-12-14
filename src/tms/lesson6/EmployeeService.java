package tms.lesson6;

public class EmployeeService {

    public User create(String name, int age, boolean isMan) {
        User user = new User();

        user.name = name;
        user.age = age;
        user.isMan = isMan;

        return user;
    }

}
