package Questions;

public class Q1 {
    public static void main(String[] args) {
        //Find how many numbers are there contains even number of digits
        int[] nums = {12,234,123,3,2344,2,244};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
    }
    static int findNumbers(int[] nums) {
        int cout = 0;
        for (int num : nums) {
            if(even(num)){
               cout++;
            }
        }
        return cout;
    }

    //check Number of digits is even
    static boolean even(int num) {
        int NumberOfDigits = digits(num);
        return NumberOfDigits % 2 == 0;
    }
    //check number of digits
    static int digits (int num) {
        //check if number is negative make it positive
        if(num < 0) {
           num =  num * -1;
        }
        // case check
        if(num == 0) {
            return 1;
        }
        int digit = 0;
        while (num > 0) {

            digit++;
            num = num /10;
        }
        return digit ;
    }
}
