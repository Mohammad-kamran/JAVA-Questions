package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3] ;
//        System.out.println(arr.length);
        //taking input in 2D array

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //printing output
//        for(int row = 0 ; row < arr.length ; row ++){
//            for(int col = 0 ; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + "  ");
//            }
//            System.out.println();
//        }

        //printing output
        for(int row = 0 ; row < arr.length ; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }

}
