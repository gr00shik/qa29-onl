package tms.lesson7;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        FuncService funcService = new FuncService();

        Employee emp = new Employee("oldName", Type.DEVELOPER, Sex.WOMAN);

        funcService.setName(emp, "newName");

        System.out.println(emp.getName());

        int value = 10;

        System.out.println(value);


        value = funcService.inc(value);

        System.out.println(value);


        int value1, value2 = 10;

        Employee [] list = {
          new Employee("user1", Type.DEVELOPER, Sex.MAN),
          new Employee("user2", Type.TESTER, Sex.WOMAN),
          new Employee("user3", Type.ANALITIC, Sex.MAN),
          new Employee("user4", Type.DEVELOPER, Sex.WOMAN),
          new Employee("user5", Type.DEVELOPER, Sex.IT)
        };

        StaticService staticService = new StaticService();
        staticService.test();

        System.out.println(Arrays.toString(list));

        int min = 800;

        EmployeeReport service = new EmployeeReport();

        service.printEmployeeNameIfSalaryMoreThan(list, min);

//        service.printEmployeeNameIfSalaryMoreThan(new Employee("", 100), min);

    }

    public static void printInfo() {
        System.out.println("my mainapp for lecture 7");
    }

}
