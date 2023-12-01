package Searching;

public class M2LinearSearch {
    public static void main (String[] args) {
        int[] array = {21 , 12 , 34 , 57 , 88};
        int target = 88;
        int output = LinearSearch(array , target);
        System.out.println(output);
    }
    static int LinearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}
