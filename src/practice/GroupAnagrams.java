package practice;

import java.util.List;
import java.util.Stack;

public class GroupAnagrams {


    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        return null;
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        String res = "";
        for(int i=0;i<str.length();i++){
            Stack s = new Stack();
            String result = "";
            int start = i;
            while(start<str.length() && !s.contains(str.charAt(start))){
                result = result + str.charAt(start);
                s.push(str.charAt(start));
                start++;
            }
            if(result.length()>res.length()){
                res = result;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("test");
        System.out.println(stack.contains("test"));

        String s = "charan";
        char q = 'y';
        System.out.println(s+q);

        System.out.println(longestSubstringWithoutDuplication("clementisacap"));
    }
}
