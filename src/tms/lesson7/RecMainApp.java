package tms.lesson7;

public class RecMainApp {

    public static void main(String[] args) {

        int value = 4;

        RecurService recurService = new RecurService();

//        System.out.println(recurService.factorial(value));

        int result = recurService.fibonacci(6);

        System.out.println(result);

    }

}
