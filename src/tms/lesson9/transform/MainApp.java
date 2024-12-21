package tms.lesson9.transform;

public class MainApp {

    public static void main(String[] args) {

        String valueString = "bal-bla";

        Integer valueInt = 10;

        User user = new User("Vasya");

        PrintService service = new PrintService();

        service.print(valueString);
        service.print(valueInt);
        service.print(user);

    }
}
