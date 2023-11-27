package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class INPUTS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[1] = 5;
//        arr[2] = 53;
//        arr[3] = 543;
//        arr[4] = 5344;
//
//        System.out.println(arr[4]);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));


        // Array of objects

        String[] array = new String[4];
        for (int i = 0; i < array.length; i++) {
            array[i]= in.next();
        }
        System.out.println(Arrays.toString(array));
    }
}
