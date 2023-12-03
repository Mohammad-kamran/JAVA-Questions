package Questions;
// find max wealth
public class Q3 {
    // Q 1672. Richest Customer Wealth
    public static void main (String[] args){
        int[][] arr = {
                {1 ,23,4},
                {4,34,5},
                {1,4,5}
        };
        int answer = MaxWealth(arr);
        System.out.println(answer);
    }
    static int MaxWealth(int[][] accounts ) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length ; person++) {
            int sum = 0 ;
            for(int account = 0 ; account < accounts[person].length ; account++){
                sum = sum + accounts[person][account];
            }
            if(ans < sum){
                ans = sum ;
            }
        }
        return ans;
    }
}
