package Searching;
import java.util.Scanner;
import java.util.ArrayList;
//Linear search with arraylist
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
            System.out.println("enter initial size of arraylist");
        int size = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);

            System.out.println("Enter element in arrayList");

        //Taking Input from user in arraylist
        for (int i = 0; i < size ; i++)
        {
            list.add(input.nextInt());
        }
            System.out.println(list);

            System.out.println("what are you searching for ");
        int in = input.nextInt();

        if(list.contains(in))
        {
            System.out.println(list.indexOf(in));
        }
        else
        {
            System.out.println("element  not found !");
        }
    }
}
