package Searching;

import java.util.Scanner;

public class Searchinrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {12,2,23,34,45,56,56,67,78,854,35,34};
        System.out.println("Enter the range ");
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println("Enter target ");
        int target = input.nextInt();
        System.out.println(SearchInRange(array,start,end,target));


    }
    static int SearchInRange(int[] array , int start , int end , int target ){
        for (int i = start; i <= end ; i++) {
            int element = array[i];
            if(element == target){
                return array[i];
            }
        }
        return -1;
    }
}
