package algoExpert;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void printFibTillTen(){
        int first = 0;
        int second = 1;
        for(int i=0;i<10;i++){
            System.out.println(first+second);
            int temp = second;
            second = first+temp;
            first=temp;
        }
    }



    public static void main(String[] args) {

        List<List<Integer>> getList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        newList.add(43);
        newList.add(67);
        getList.add(newList);
        Integer val = newList.remove(1);
        System.out.println(val);
        System.out.println(getList.size());
    }
}
