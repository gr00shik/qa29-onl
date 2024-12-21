package tms.lesson9.transform;

public class PrintService {

    public void print(Object obj) {

        if (obj instanceof String) {
            String val = (String)obj;
            System.out.println(val.toUpperCase());
        }

        if (obj instanceof Integer) {
            Integer val = (Integer)obj;
            System.out.println(val + 1);
        }

        if (obj instanceof User) {
            User val = (User)obj;
            System.out.println(val.getName());
        }

    }

}
