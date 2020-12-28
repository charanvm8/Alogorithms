package dynamicProgramming.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LongestCommonSub {

    //static List<Pointer> points = new ArrayList<>();

//    public static int longestSubRec(String s1,String s2,int pos1, int pos2){
//        if(pos1==0 || pos2==0){
//            return 0;
//        }
//        Pointer pointFound = getPointer(pos1-1,pos2,points);
//        if(pointFound!=null){
//            return pointFound.result;
//        }
//        if(s1.charAt(pos1-1)==s2.charAt(pos2-1)){
//            int res = 1+longestSubRec(s1,s2,pos1-1,pos2-1);
//            points.add(new Pointer(pos1-1,pos2-1,res));
//            return res;
//        }
//        else{
//            int res = Math.max(longestSubRec(s1,s2,pos1-1,pos2),longestSubRec(s1,s2,pos1,pos2-1));
//            points.add(new Pointer(pos1-1,pos2,res));
//            return res;
//        }
//    }

//    public static Pointer getPointer(int x, int y, List<Pointer> pointers){
//        Optional<Pointer> p = pointers.stream().filter(
//                item-> item.X == x && item.Y == y).findFirst();
//        return p.orElse(null);
//    }
//
//    static class Pointer {
//        int X;
//        int Y;
//        int result;
//
//        public Pointer(int x,int y,int result){
//            this.X = x;
//            this.Y = y;
//            this.result = result;
//        }
//    }

    public static int longestSubRec(String s1,String s2, int s1Len,int s2Len,int s1Index,int s2Index){
        if(s1Index==s1Len || s2Index ==s2Len){
            return 0;
        }
        if(s1.charAt(s1Index)==s2.charAt(s2Index)){
            return 1+longestSubRec(s1,s2,s1Len,s2Len,s1Index+1,s2Index+1);
        }
        return Math.max(longestSubRec(s1,s2,s1Len,s2Len,s1Index+1,s2Index),longestSubRec(s1,s2,s1Len,s2Len,s1Index,s2Index+1));
    }

    // Time complexity O(m*n)
    static int[][] max = new int[100][100];
    public static int longestSubRec(String s1,String s2, int s1Len,int s2Len){
        if(s1Len<0 || s2Len<0){
            return 0;
        }
        if(max[s1Len][s2Len]!=0){
            return max[s1Len][s2Len];
        }
        if(s1.charAt(s1Len)==s2.charAt(s2Len)){
            max[s1Len][s2Len] = 1+longestSubRec(s1,s2,s1Len-1,s2Len-1);
            return max[s1Len][s2Len];
        }
        max[s1Len][s2Len] = Math.max(longestSubRec(s1,s2,s1Len-1,s2Len),longestSubRec(s1,s2,s1Len,s2Len-1));
        return max[s1Len][s2Len];
    }

    public static int longestSub(String s1,String s2){
        if(s1.length()==0 || s2.length()==0){
            return 0;
        }
        int[][] longSub = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    longSub[i][j] = 1+longSub[i-1][j-1];
                }
                else{
                    longSub[i][j] = Math.max(longSub[i-1][j],longSub[i][j-1]);
                }
            }
        }
        return longSub[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(longestSub(s1,s2));
    }
}
