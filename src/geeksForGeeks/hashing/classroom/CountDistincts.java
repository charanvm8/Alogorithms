package geeksForGeeks.hashing.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistincts {

    public static void countDistincts(int[] arr,int k){
        Map<Integer,Integer> strs = new HashMap<>();

        for(int i=0;i<k;i++){
            strs.put(arr[i],strs.getOrDefault(arr[i],0)+1);
        }
        System.out.print(strs.size()+" ");
        for(int i=k;i<arr.length;i++){

            if(strs.get(arr[i-k])>1){
                strs.put(arr[i-k],strs.get(arr[i-k])-1);
            }
            else {
                strs.remove(arr[i-k]);
            }
            strs.put(arr[i],strs.getOrDefault(arr[i],0)+1);
            System.out.print(strs.size()+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,40,10};
        countDistincts(arr,4);
    }
}
