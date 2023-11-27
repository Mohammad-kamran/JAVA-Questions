package Conditionals_loops;

import java.util.Scanner;

//calculator program in java
public class CalculaterProgram {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("What Operation do you want to operate ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Multiplication ");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Reminder");

        int operation = sc.nextInt();
        if(operation==1){
            System.out.println("Result  = " + Addition(num1,num2));
        }else if(operation==2){
            System.out.println("Result  = " + Subtraction(num1,num2));
        }else if(operation==3){
            System.out.println("Result  = " + Multiplication(num1,num2));
        }else if(operation==4){
            System.out.println("Result  = " + Division(num1,num2));
        }else if(operation==5){
            System.out.println("Result  = " + Reminder(num1,num2));
        }else {
            System.out.println("invalid input!");
        }

    }
    public static double Addition(double n1,double n2){
        return n1 + n2;
    }public static double Subtraction(double n1,double n2){
        return n1 - n2;
    }public static double Multiplication(double n1,double n2){
        return n1 * n2;
    }public static double Division(double n1,double n2){
        return n1 / n2;
    }public static double Reminder(double n1,double n2){
        return n1 % n2;
    }
}
