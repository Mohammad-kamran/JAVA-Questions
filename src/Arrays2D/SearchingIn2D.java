package Arrays2D;

import java.util.Arrays;

public class SearchingIn2D {
    public static void main(String[] args){
        int[][] array = {
                {12,4,243},
                {56,67,3},
                {34,734,35}
        };
        int target = 35;
        int[] ans = SearchingIn2DArray(array,target);//its return in row , col format
        System.out.println(Arrays.toString(ans));
    }
    static int[] SearchingIn2DArray(int[][] array , int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
