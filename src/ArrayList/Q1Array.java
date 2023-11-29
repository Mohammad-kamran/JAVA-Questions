package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// remove duplicates  from arraylist
public class Q1Array {
    public static void main (String[] args ){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        System.out.println("Enter 5 integers : ");
        for(int i =0; i < 5; i++){
            int temp = input.nextInt();

            if(!list.contains(temp))
                list.add(temp);
        }
        Collections.sort(list);

        System.out.println(list);
    }
}
