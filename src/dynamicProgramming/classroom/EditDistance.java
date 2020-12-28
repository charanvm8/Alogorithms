package dynamicProgramming.classroom;

import utility.PrintArray;

public class EditDistance {

//    public static int editDistance(String s1,String s2,int index1,int index2){
//        if(index1<0){
//            return index2;
//        }
//        if(index2<0){
//            return index1;
//        }
//        if (s1.charAt(index1) == s2.charAt(index2)) {
//            return editDistance(s1,s2,index1-1,index2-1);
//        }
//        int replace = 1+editDistance(s1,s2,index1-1,index2-1);
//        int addition = 1+editDistance(s1,s2,index1,index2-1);
//        int deletion = 1+editDistance(s1,s2,index1-1,index2);
//        return Math.min(replace,Math.min(addition,deletion));
//    }

    public static int editDistance(String s1,String s2,int index1,int index2){
        if(index1<0){
            return index2+1;
        }
        if(index2<0){
            return index1+1;
        }
        if(s1.charAt(index1)==s2.charAt(index2)){
            return editDistance(s1,s2,index1-1,index2-1);
        }
        int replace = editDistance(s1,s2,index1-1,index2-1);
        int delete = editDistance(s1,s2,index1-1,index2);
        int delete2 = editDistance(s1,s2,index1,index2-1);
        return 1+Math.min(replace,Math.min(delete,delete2));
    }

    public static int eD(String s1,String s2,int len1,int len2){
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0;i<=len2;i++){
            dp[0][i] = i;
        }
        for(int i=0;i<=len1;i++){
            dp[i][0] = i;
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],
                                Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        PrintArray.printArray(dp);
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        String s1 = "SATUR";
        String s2 = "SUN";
        System.out.println(eD(s1,s2,s1.length(),s2.length()));
    }
}
