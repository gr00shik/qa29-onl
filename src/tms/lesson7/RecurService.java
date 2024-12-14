package tms.lesson7;

public class RecurService {

    public int factorial(int i) {
        return i == 1
                ? 1
                : i * factorial(i - 1);
    }

    public int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

