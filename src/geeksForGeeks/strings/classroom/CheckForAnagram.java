package geeksForGeeks.strings.classroom;

import java.util.Arrays;

public class CheckForAnagram {

    static final int CHAR = 256;

    // Naive Method
    public static boolean checkIfAnagramNaive(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s1Chars = s1.toCharArray();
        Arrays.sort(s1Chars);
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s2Chars);
        for(int i=0;i<s1.length();i++){
            if(s1Chars[i]!=s2Chars[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] chars = new int[CHAR];
        for(int i=0;i<s1.length();i++){
            chars[(int)s1.charAt(i)]++;
            chars[(int)s2.charAt(i)]--;
        }
        for(int j=0;j<chars.length;j++){
            if(chars[j]!=0){
                return false;
            }
        }
        return true;
    }
}
