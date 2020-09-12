package geeksForGeeks.strings.classroom;

import java.util.Arrays;

public class LeftMostRepeatingCharacterIndex {

    static final int CHAR = 256;

    // Naive Method
    public static int leftMostRepeatingNaive(String s1){
        for(int i=0;i<s1.length()-1;i++){
            char val = s1.charAt(i);
            for(int j=1;j<s1.length();j++){
                if(val==s1.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int leftMostRepeating(String s1){
        int[] chars = new int[CHAR];
        for(int i=0;i<s1.length();i++){
            chars[(int)s1.charAt(i)]++;
        }
        for(int j=0;j<s1.length();j++){
            if(chars[(int)s1.charAt(j)]>1){
                return j;
            }
        }
        return -1;
    }

    //Single loop
    public static int leftMostRepeating1(String s1){
        int[] chars = new int[CHAR];
        Arrays.fill(chars,-1);
        int res = Integer.MIN_VALUE;
        for(int i=0;i<s1.length();i++){
            if(chars[(int)s1.charAt(i)]!=-1){
                res = Math.min(res,chars[(int)s1.charAt(i)]);
            }
            else{
                chars[(int)s1.charAt(i)]=i;
            }
        }
        return res==Integer.MIN_VALUE?-1:res;
    }

    //Optimized
    public static int leftMostRepeating2(String s1){
        boolean[] chars = new boolean[CHAR];
        int res = -1;
        for(int i=s1.length()-1;i>=0;i--){
            if(chars[(int)s1.charAt(i)]){
                res = i;
            }
            else{
                chars[(int)s1.charAt(i)] = true;
            }
        }
        return res;
    }

}
