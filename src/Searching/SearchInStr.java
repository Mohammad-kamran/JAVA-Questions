package Searching;
import java.util.Arrays;
public class SearchInStr {
    public static void main(String[] args){
        String str = "Kamran";
        char target = 'p';
        boolean result = Check(str,target);
        System.out.println(result);
    }
    static boolean Check(String str , char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
