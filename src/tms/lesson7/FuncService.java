package tms.lesson7;

public class FuncService {

    public int inc(int value) {
        return value + 1;
    }

    public void setName(Employee emp, String newName) {

//        emp = new Employee(newName, Type.TESTER, Sex.MAN);

        emp.setName(newName);
    }

}
