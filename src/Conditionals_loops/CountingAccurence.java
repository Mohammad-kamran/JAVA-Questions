package Conditionals_loops;

public class CountingAccurence {
    public static void main(String[] args){
        int number = 933475;
        int check = 3;
        int cout = 0;

        while(number>0) {

            int rem = number % 10;
            if (rem == 3) {
                cout = cout +1;
            }
            number = number/10;
        }
        System.out.println(cout);
    }
}
