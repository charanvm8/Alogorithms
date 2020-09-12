package geeksForGeeks.strings.classroom;

import java.util.Stack;

public class ReverseWordsInString {

    public static String reverseWordsInString(String s){
        Stack<String> vals = new Stack<>();
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                vals.add(s.substring(start,i));
                start = i+1;
            }
        }
        return "";
    }
}
