package Conditionals_loops;

public class ReverseAnumber {
    public static void main (String[] args){
        int number = 304985;
        int result = Reverse(number);
        System.out.println(result);
    }

    public static int Reverse(int number) {
        int result = 0;
        while (number>0){

            int rem = number % 10;
            number = number/10;
            result = result * 10 + rem;
        }
        return result;

    }
}
