package Conditionals_loops;

import java.util.Scanner;

public class CalculatorM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from the user until they press x or X
        int ans = 0;
        while(true){
            System.out.println("Enter the operator  + , - , * , / , % or x for exit the program :");
            int op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%' ){

                //Input Two Numbers
                System.out.println("Enter Two Numbers :");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }

            else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid Operation!");
            }

            System.out.println(ans);
        }
    }
}
