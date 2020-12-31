package geeksForGeeks.arrays.classroom;

import utility.PrintArray;

public class MaxCirSubArrSum {

    public static int maxCirSubArrSum(int[] arr,int len){
        if(len==0){
            return 0;
        }
        int res = 0;
        for(int i=0;i<len;i++){
            int currValue = arr[i];
            int currMax = arr[i];
            for(int j=1;j<len;j++){
                currValue = currValue+arr[(j+i)%len];
                currMax = Math.max(currMax,currValue);
            }
            res = Math.max(res,currMax);
        }
        return res;
    }

    public static int maxCirSubArrSum1(int[] arr,int len){
        if(len==0){
            return 0;
        }
        for(int i=1;i<len;i++){
            if(arr[i]>arr[i-1]){
                arr[i]+=arr[i-1];
            }
            else{
                arr[i] = Math.max(arr[i]+arr[i-1],arr[i-1]);
            }
        }
        return arr[len-1];
    }

    public static void main(String[] args) {
        int[] arr = {5,-2,3,4};
        System.out.println(maxCirSubArrSum1(arr,arr.length));
    }
}
