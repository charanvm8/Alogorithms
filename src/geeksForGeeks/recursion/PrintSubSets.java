package geeksForGeeks.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSets {

//    public static void printSubSets(String s){
//        List<String> sets = new ArrayList<>();
//        printSubSet(s,sets);
//
//    }
//
//    public static void printSubSet(String s,List<String> sets){
//        if(s.length()==0){
//            return;
//        }
//        char c = s.charAt(0);
//        List<String> newSets = new ArrayList<>();
//        for(String q:sets){
//            newSets.add(q+c);
//            System.out.println(q+c);
//        }
//        sets.addAll(newSets);
//        printSubSet(s.substring(1),sets);
//    }

    public static void printSubSets(String s){
        getSubSet(s,"");
    }

    public static void getSubSet(String s,String curr){
        if(s.equals("")){
            System.out.println(curr);
            return;
        }
        getSubSet(s.substring(1),curr);
        getSubSet(s.substring(1),curr+s.charAt(0));
    }
}
