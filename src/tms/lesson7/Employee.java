package tms.lesson7;

public class Employee {

    private String name;

    private int salary;

    private Type state;

    private Sex sex;

    private int age;

    private String password;

    public Employee(String name, Type state, Sex sex) {
        this.name = name;
        this.state = state;
        this.sex = sex;
        salary = state.getSalary();
    }

    public void printName() {
        System.out.println(name);
    }

    public Type getState() {
        return state;
    }

    public void setState(Type state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
