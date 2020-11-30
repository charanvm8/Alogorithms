package dynamicProgramming.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LongestCommonSub {

    static List<Pointer> points = new ArrayList<>();

    public static int longestSubRec(String s1,String s2,int pos1, int pos2){
        if(pos1==0 || pos2==0){
            return 0;
        }
        Pointer pointFound = getPointer(pos1-1,pos2,points);
        if(pointFound!=null){
            return pointFound.result;
        }
        if(s1.charAt(pos1-1)==s2.charAt(pos2-1)){
            int res = 1+longestSubRec(s1,s2,pos1-1,pos2-1);
            points.add(new Pointer(pos1-1,pos2-1,res));
            return res;
        }
        else{
            int res = Math.max(longestSubRec(s1,s2,pos1-1,pos2),longestSubRec(s1,s2,pos1,pos2-1));
            points.add(new Pointer(pos1-1,pos2,res));
            return res;
        }
    }

    public static Pointer getPointer(int x, int y, List<Pointer> pointers){
        Optional<Pointer> p = pointers.stream().filter(
                item-> item.X == x && item.Y == y).findFirst();
        return p.orElse(null);
    }

    static class Pointer {
        int X;
        int Y;
        int result;

        public Pointer(int x,int y,int result){
            this.X = x;
            this.Y = y;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(longestSubRec(s1,s2,s1.length(),s2.length()));
    }
}
