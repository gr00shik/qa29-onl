package tms.lesson5;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int find = 10;

        int[][] arr = new int[4][];

        arr[0] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == find) {
                    System.out.println("Index i: " + i + ", j: " + j);
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));


//        int[] arr = {20 ,5 ,7, 10, 15};
//
//        arr[2] = 30;

//        Arrays.fill(arr, 10);

//        int result = Arrays.binarySearch(arr, 15);

//        int[] copy = Arrays.copyOf(arr, arr.length * 2);
//
//        int[] range = Arrays.copyOfRange(arr, 1 , 3);
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));

    }
}
