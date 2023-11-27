// Alphabet Case Check

package Conditionals_loops;
import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Take a char input
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LoverCase");
        }else {
            System.out.println("UpperCase");
        }
    }
}
