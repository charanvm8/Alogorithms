package geeksForGeeks.strings.classroom;

public class PalindromeCheck {

    public static boolean palindromeCheck(String s){
        int len = s.length();
        if(len==0){
            return false;
        }
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String z = "abaz";
        System.out.println(palindromeCheck(z));
    }
}
