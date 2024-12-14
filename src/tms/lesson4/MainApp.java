package tms.lesson4;

import java.util.Arrays;
import java.util.Random;

public class MainApp {

    public static void main(String[] args) {

        int [] mass = {60, 30, 20, 10, 50, 40, 0, 70};

        for (int j = 0; j < mass.length; j++) {

            boolean swap = false;

            new Random().nextInt(0, 10);

            for (int i = 0; i < mass.length - 1 - j; i++) {
                if (mass[i] > mass[i + 1]) {
                    int temp = mass[i];

                    mass[i] = mass[i + 1];

                    mass[i + 1] = temp;

                    swap = true;

                }
            }

            if (!swap) {
                break;
            }

        }

        System.out.println(Arrays.toString(mass));


//        int num = 40;
//
//        boolean isFound = false;

//        for (int item : mass) {
//
//            if (item == num) {
//                isFound = true;
//                break;
//            }
//
//        }

//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i] == num) {
//                isFound = true;
        //        break;
//            }
//        }

//        System.out.println(isFound ? "Found" : "Not Found");

//        Scanner sc = new Scanner(System.in);

//        int[] value = new int[5];

//        int [] value;
//        value = new int[10];

//        int[] value = new int[]{1,3,6,9};

//        int[] value = {1,2,4,7};

//        int[] value = new int[] {1,3,5,7,9};
//
//        int [] value1 = new int[value.length + 1];
//
//        for (int i = 0; i < value.length; i++) {
//            value1[i] = value[i];
//        }
//
//        System.out.println(Arrays.toString(value));
//        System.out.println(Arrays.toString(value1));


//        value = new int[20];
//
//
//        for (int i = 0; i < value.length; i++) {
//
//            Random random = new Random();
//            int numb = random.nextInt(-10, 15);
//
//            value[i] = numb;
//        }

//        System.out.println(Arrays.toString(value));

    }

}
