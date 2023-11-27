package Conditionals_loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the n th number ");
        int result = NthFibonacci(n);
        System.out.println( n +" th Fibonacci is " + result);
    }
    public static int NthFibonacci(int n){
        if(n <= 1){
            return n;
        }
        int first = 0 , second = 1;
        for (int i = 2; i <= n  ; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
