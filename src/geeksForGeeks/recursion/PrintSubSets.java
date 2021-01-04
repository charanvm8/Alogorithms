package geeksForGeeks.recursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintSubSets {

    public static void printSubSets(String s,String currString,int currIndex,int len){
        if(currIndex==len){
            System.out.println(currString);
            return;
        }
        printSubSets(s,currString,currIndex+1,len);
        printSubSets(s,currString+s.charAt(currIndex),currIndex+1,len);
    }

    public static void main(String[] args) {
        String s = "ABC";
        printSubSets(s,"",0,s.length());
    }
}
