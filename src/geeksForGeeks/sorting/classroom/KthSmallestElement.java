package geeksForGeeks.sorting.classroom;

import java.util.Arrays;

public class KthSmallestElement {

    //Naive
    public static int kthSmallestEle(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    //Improved
    public static int kthSmallestElement(int[] arr,int k){
        if(arr.length<k){
            return -1;
        }
        return getKthSmallestEle(arr,0,arr.length-1,k);
    }

    private static int getKthSmallestEle(int[] arr,int start,int end,int k){
        if(start<end){
            int p = partition(arr,start,end);
            if(p==(k-1)){
                return arr[p];
            }
            else if(arr[k-1]>arr[p]){
                return getKthSmallestEle(arr,p+1,end,k);
            }
            else{
                return getKthSmallestEle(arr,start,p-1,k);
            }
        }
        return -1;
    }

    private static int partition(int[] arr, int start,int end){
        return 1;
    }


}
