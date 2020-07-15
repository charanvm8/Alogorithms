package geeksForGeeks.recursion;

import java.util.ArrayList;

public class LexSort {

//    static ArrayList<String> powerSet(String s)
//    {
//        ArrayList<String> result = new ArrayList<>();
//        getPowerSet(s,s.length()-1,"",result);
//        return result;
//    }
//
//    static void getPowerSet(String s,int index,String pres,ArrayList<String> result){
//        if(s.length()==0){
//            result.add(pres);
//            System.out.println("Test"+pres);
//            return;
//        }
//        getPowerSet(s.substring(0,index),index-1,pres+s.charAt(index),result);
//        //getPowerSet(s.substring(),index-1,pres,result);
//
//    }

    static ArrayList<String>  powerSet(String s){
        ArrayList<String> result = new ArrayList<>();
        int len = s.length();
        getSubSets(s,0,len,"",result);
        return result;
    }

    static void getSubSets(String s,int index,int len,String pres,ArrayList<String> result){
        if(index>=len){
            result.add(pres);
            return;
        }

        getSubSets(s,index+1,len,pres+s.charAt(index),result);
        getSubSets(s,index+1,len,pres,result);


    }
}
