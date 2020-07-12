package geeksForGeeks.recursion;

public class CheckPalindrome {

    public boolean checkPalindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        return s.charAt(start)==s.charAt(end) && checkPalindrome(s,start+1,end-1);
    }
}
