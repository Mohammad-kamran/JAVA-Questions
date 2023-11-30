package Q_ArrayList;
import java.lang.Integer;
import java.util.Scanner;
import java.util.ArrayList;
/*
Create a menu of the program with the following options
 1 add element
 2 Remove
 3 display
 4 exit
 This program runs infinitely until the user choose the further options
 */

public class Q_Arraylist {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        while(true){
            displayMenu();
            int choice = input.nextInt();

            //add element"
            if(choice == 1)
            {
                System.out.println("Enter an integer :");
                list.add(input.nextInt());
                System.out.println("added . ");
            }

            // Remove
            if( choice == 2)
            {
                System.out.println("Enter the Number you want to remove ");
                int removeInteger = input.nextInt();

                if(list.contains(removeInteger))
                {
                    list.remove(Integer.valueOf(removeInteger));
                    System.out.println("Removed .");
                }
                else
                {
                    System.out.println("Element not found !");
                }

            }

            //display
            if(choice == 3)
            {
                System.out.println("Your List : " + list);
            }

            //exit
            if(choice == 4)
            {
                System.out.println("Bye.");
                break;
            }

        }
    }
    private static void displayMenu()
    {
        System.out.println();
        System.out.println("1 add element");
        System.out.println("2 Remove");
        System.out.println("3 display");
        System.out.println("4 exit ");
        System.out.println();
    }
}
