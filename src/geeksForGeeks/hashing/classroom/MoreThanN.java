package geeksForGeeks.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class MoreThanN {

    public static void printMoreThanN(int[] arr,int N,int K){
        int factor = K/N;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<K;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {30,10,20,30,30,40,30,40,30};
        printMoreThanN(arr,4,arr.length);
    }
}
