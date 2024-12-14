package tms.lesson7;

public enum Type {

    DEVELOPER(1000),
    TESTER(900),
    ANALITIC(700);

    private int salary;

    Type(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
