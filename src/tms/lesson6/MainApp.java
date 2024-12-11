package tms.lesson6;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        User vasya = new User("Vasya", 30 , true);

        String vasSumm = vasya.summery();

        System.out.println(vasSumm);

        User petsya = new User("Petsya", 35, true);

        String petSumm = petsya.summery();
        System.out.println(petSumm);

        User vova = new User("Vova", 25, true, "nick");

        MathService mathService = new MathService();

        int v1 = 10;
        int v2 = 20;

        int resultOfSum = mathService.sum(v2, v1);
        System.out.println(resultOfSum);

        int resultOfMinus = mathService.minus(v2, v1);
        System.out.println(resultOfMinus);
        mathService.multiply(20, 5);

        EmployeeService empSrv = new EmployeeService();

        User olya = empSrv.create("Olya", 20, false);

        String olyaSumm = olya.summery();

        System.out.println(olyaSumm);
    }

}
