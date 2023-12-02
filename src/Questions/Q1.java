package Questions;

public class Q1 {
    public static void main(String[] args){
        //Find number in even number of digits  Leetcode 1295
        int[] nums = {12,234,123,3,2344,2,244};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int cout = 0;
        for (int num : nums) {
            if(even(num)){
               cout++;
            }
        }
        return cout;
    }

    static boolean even(int num){
        int Numberofdigits = digits(num);
        if (Numberofdigits % 2 == 0 ){
            return true;
        }
        return false;
    }

    static int digits (int num){
        int digit = 0;
        while (num > 0){

            digit++;
            num = num /10;
        }
        return digit ;
    }
}
