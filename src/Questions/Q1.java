package Questions;

public class Q1 {
    public static void main(String[] args) {
        //Find number in even number of digits  Leetcode 1295
        int[] nums = {12,234,123,3,2344,2,244};
        System.out.println(findNumbers(nums));
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
        int digit = 0;
        while (num > 0) {

            digit++;
            num = num /10;
        }
        return digit ;
    }
}
