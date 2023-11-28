package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IOinArryList {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        
        // take input in array list 
        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        //Print output
        for (int i = 0 ; i< 4 ; i++){
            System.out.println(list.get(i));
        }
    }
}
