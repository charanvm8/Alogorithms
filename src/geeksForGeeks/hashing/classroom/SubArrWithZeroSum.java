package geeksForGeeks.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrWithZeroSum {

    public static boolean subArrWithZero(int[] arr,int len){
        if(len<=1){
            return false;
        }
        Set<Integer> exists = new HashSet<>();
        int prev = 0;
        for(int i=0;i<arr.length;i++){
            prev += arr[i];
            if(exists.contains(prev) || prev == 0){
                return true;
            }
            exists.add(prev);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={1,4,13,-3,-10,5};
        System.out.println(subArrWithZero(arr,arr.length));
    }
}
