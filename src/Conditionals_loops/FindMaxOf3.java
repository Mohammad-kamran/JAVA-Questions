package Conditionals_loops;

import java.util.Scanner;

public class FindMaxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = max(a,b,c);
        System.out.println(result);
    }
    static int max(int a, int b , int c ){
        int max = a;
        if ( b > max){
            max = b;
        }
        if( c > max){
            max = c;
        }
        return max;
    }
}
