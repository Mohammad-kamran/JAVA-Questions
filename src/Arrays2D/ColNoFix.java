package Arrays2D;

public class ColNoFix {
    public static void main(String[] args){
        int[][] array = {
                {1,2,3,3,4},
                {4,23},
                {3,34,5}
        };

        //Print that 2D matrix
        for(int row = 0; row < array.length; row ++){
            for(int col = 0 ; col < array[row].length ; col ++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
