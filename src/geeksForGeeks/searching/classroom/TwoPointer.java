package geeksForGeeks.searching.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoPointer {

    //Naive
    public static boolean checkIfNumsEquals(int[] arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    // Using Map
    public static boolean checkIfNumsEqualsUsingMaps(int[] arr,int target){
        Set nums = new HashSet();
        for(int i=0;i<arr.length;i++){
            int diff = target-arr[i];
            if(nums.contains(diff)){
                return true;
            }
            nums.add(arr[i]);
        }
        return false;
    }

    // Using Two pointer
    public static boolean checkIfNumsEqualsUsingPointers(int[] arr,int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int tempTotal = arr[start]+arr[end];
            if(tempTotal==target){
                return true;
            }
            if(tempTotal<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}
