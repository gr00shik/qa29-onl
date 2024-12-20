package tms.lesson8.inner;

public class ClassB {

    private Inner inner;
    private String name;

    public void test() {
        System.out.println("test");
    }

    public static void testStatic() {}

    public static class Inner {

        public static void innerTest() {
            System.out.println("innerTest");
            testStatic();
        }

    }
}
