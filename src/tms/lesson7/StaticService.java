package tms.lesson7;

public class StaticService {

    private String test;
    private static String staticTest;

    public void test() {
        staticTest2();
        System.out.println(test);
    }

    public static void staticTest() {
        System.out.println(staticTest);
        staticTest2();
    }

    public static void staticTest2() {

    }

}
