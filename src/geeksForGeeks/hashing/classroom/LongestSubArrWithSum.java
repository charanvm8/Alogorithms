package geeksForGeeks.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWithSum {

    public static int longSubArrWithSum(int[] arr,int len,int target){
        int prevSum = 0;
        Map<Integer,Integer> currMap = new HashMap<>();
        int res = 0;
        for(int i=0;i<len;i++){
            prevSum +=arr[i];
            if(prevSum == target){
                res = Math.max(res,i+1);
            }
            if(currMap.containsKey(prevSum)){
                res = Math.max(res,i-currMap.get(prevSum));
            }
            if(!currMap.containsKey(prevSum)){
                currMap.put(prevSum,i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,-4,-4,9,-2,2};
        System.out.println(longSubArrWithSum(arr,arr.length,0));
        int[] arr1 = {3,1,0,1,8,2,3,6};
        System.out.println(longSubArrWithSum(arr1,arr1.length,5));
        int[] arr2 = {8,3,7,-3};
        System.out.println(longSubArrWithSum(arr2,arr2.length,15));
    }
}
