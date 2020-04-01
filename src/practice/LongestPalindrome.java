package practice;

public class LongestPalindrome {

    // Time Complexity n^3

    public static boolean checkIfPalindrome(String str){
        boolean palindrome = true;
        int len = str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(len-i-1)!=str.charAt(i)){
                return false;
            }
        }
        return palindrome;
    }
    public static String longestPalindromicSubstring(String str) {
        String longest = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                String result = str.substring(i,j);
                if(checkIfPalindrome(result) && result.length()>longest.length()) {
                    longest = result;
                }
            }
        }
        return longest;
    }

    // TODO : Recursion

    // TODO : DP

    public static void main(String[] args) {
        System.out.print(longestPalindromicSubstring("abaxyzzyxf"));
    }
}
