package Conditionals_loops;
import java.util.Scanner ;
public class Fibonachi{
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n th number\t");
        int n = sc.nextInt();

        int result = NthFibonacci(n);
        System.out.println( n + "\tFibonacci is\t" + result);

    }
    public static int NthFibonacci(int n){
        if(n<=1){
            return n;
        }
        int first = 0 , second = 1;

        for(int i = 2;i <= n ; i++){
            int next = first + second ;
            first = second;
            second = next;
        }
        return second;
    }
}