package Questions;
//Find how many numbers are there that contain odd number of digits
public class Q2 {
    public static void main(String[] args) {
        int[] nums = {12,23,344,4,56,6,76,78,7};    //ans = 4
        System.out.println(OddNumberOfDigits(nums));
    }
    static int OddNumberOfDigits(int[] nums){
        int cout = 0;
        for(int num : nums){
            if(Odd(num)){
                cout++;
            }
        }
        return cout;
    }

    private static boolean Odd(int num) {
        int NumberOfDigits = Digits(num);
        return NumberOfDigits % 2 != 0 ;
    }

    private static int Digits(int num) {
        int cout = 0 ;
        while (num > 0 ){
            cout++;
            num = num /10 ;
        }
        return cout ;
    }

}
