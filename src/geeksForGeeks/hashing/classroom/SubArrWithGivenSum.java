package geeksForGeeks.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrWithGivenSum {

    public static boolean subArrWithSum(int[] arr,int len,int target){
        int currSum = 0;
        Set<Integer> sums = new HashSet<>();
        for(int i=0;i<len;i++){
            currSum +=arr[i];
            if(sums.contains(target-currSum) || currSum == target){
                return true;
            }
            sums.add(currSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        System.out.println(subArrWithSum(arr,arr.length,22));
    }
}
