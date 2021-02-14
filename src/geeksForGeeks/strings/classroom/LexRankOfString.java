package geeksForGeeks.strings.classroom;

import java.util.Arrays;

public class LexRankOfString {

    public static void lexRankOfString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int res = 0;
        countLexRank(chars,s,"",0,res,-1);
        //return 0;
    }

    public static void countLexRank(char[] chars,String resString,String currString,int currIndex,int res,int index){
        if(currIndex==resString.length()){
            System.out.println(currString);
            return;
        }
        for(int i=0;i<chars.length;i++){
            countLexRank(chars,resString,currString+chars[i],currIndex+1,res,i);
        }
    }

    public static void main(String[] args) {
        String s = "BAC";
        lexRankOfString(s);
    }
}
