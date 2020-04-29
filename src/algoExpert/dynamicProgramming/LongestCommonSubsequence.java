package algoExpert.dynamicProgramming;

import java.util.List;

public class LongestCommonSubsequence {

    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        String[][] resultArr = new String[str2.length()+1][str1.length()+1];
        for(int i=0;i<=str2.length();i++){
            for(int j=0;j<=str1.length();j++){
                resultArr[i][j]="";
            }
        }
        for(int i=0;i<str2.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str2.charAt(i)==str1.charAt(j)){
                    System.out.println(str2.charAt(i));
                    System.out.println(resultArr[i][j+1]);
                    resultArr[i+1][j+1] = resultArr[i][j+1]+str2.charAt(i);
                    System.out.println(resultArr[i+1][j+1]);
                }
                else{
                    resultArr[i+1][j+1] = resultArr[i+1][j];
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String str1 = "ZXVVYZW";
        String str2 = "XKYKZPW";

        List<Character> result = longestCommonSubsequence(str1,str2);
        System.out.println(result);
    }
}
