package geeksForGeeks.dp.classroom;

public class LCS {

    public static int LCS(String s1,String s2,int pointer1, int pointer2){
        if(s1.length()<=pointer1 || s2.length()<=pointer2){
            return 0;
        }
        if(s1.charAt(pointer1)==s2.charAt(pointer2)){
            return 1+Math.max(LCS(s1,s2,pointer1+1,pointer2+1),
                                LCS(s1,s2,pointer1+1,pointer2+1));
        }
        else{
            return Math.max(LCS(s1,s2,pointer1+1,pointer2),LCS(s1,s2,pointer1,pointer2+1));
        }
    }

    static int[][] mem = new int[10][10];
    public static int LCSTopDown(String s1,String s2,int pointer1, int pointer2){
        if(s1.length()<=pointer1 || s2.length()<=pointer2){
            return 0;
        }
        if(s1.charAt(pointer1)==s2.charAt(pointer2)){
            return  1+Math.max(LCS(s1,s2,pointer1+1,pointer2+1),
                    LCS(s1,s2,pointer1+1,pointer2+1));
        }
        else{
            return Math.max(LCS(s1,s2,pointer1+1,pointer2),LCS(s1,s2,pointer1,pointer2+1));
        }
    }

    public static void main(String[] args) {
        String s1 = "XYZ";
        String s2 = "XYZ";
        System.out.println(LCS(s1,s2,0,0));
    }
}
