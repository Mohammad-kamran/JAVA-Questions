package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinimumNum {
    public static void main (String[] args ){
        // Initialize ArrayList with specific values
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(13,23,23,34,46,5,767,67));
        System.out.println(min(list));


    }
    static int min(ArrayList<Integer> list) {
        //Check if list is empty
        if(list == null || list.isEmpty()) {
            return -1;
        }
        // initialize min to the first element of the list
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
}
