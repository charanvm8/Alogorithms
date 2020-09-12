package geeksForGeeks.strings.problems;

public class ReverseWords {

    public static String reverseWords(String s) {
        char[] val = s.toCharArray();
        String res = "";
        String temp = "";
        for(int i=0;i<s.length();i++){
            System.out.println((int)s.charAt(i));
            if(((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) || ((int)s.charAt(i)>=96 && (int)s.charAt(i)<=122)){
                temp+=s.charAt(i);
            }
            else{
                res+=reverse(temp);
                temp = "";
                res+=s.charAt(i);
            }
        }
        res+=reverse(temp);
        res = reverse(res);
        return res;

    }

    static String reverse(String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
