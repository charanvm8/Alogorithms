package algoExpert;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        int[][] result = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                result[i][j]=j;
            }
            result[i][0]=i;
        }
        for(int z=0;z<result.length;z++){
            System.out.print(result[z][0]+" ");
        }
        System.out.println();

        for(int k=1;k<=str1.length();k++){
            for(int l=1;l<=str2.length();l++){
                if(str1.charAt(k-1)==str2.charAt(l-1)){
                    result[k][l] = result[k-1][l-1];
                }
                else{
                    result[k][l] = 1+Math.min(result[k-1][l],Math.min(result[k-1][l-1],result[k][l-1]));
                }
            }
        }
        System.out.println(result[0].length);
        System.out.println(result.length);
        for(int z=0;z<result.length;z++){
            for(int f=0;f<result[0].length;f++){
                System.out.print(result[z][f]+" ");
            }
            System.out.println();
        }
        return result[str1.length()][str2.length()];
    }



    public static void main(String[] args) {

        System.out.println(levenshteinDistance("xabc","abcx"));
    }
}
