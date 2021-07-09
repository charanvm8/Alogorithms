package introductionToAlgos.chapter1;

import java.util.Arrays;
import java.util.List;

public class MaxSumSubset {

    public static int maxSubArraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int sum = arr[i];
            max = Math.max(max,sum);
            for(int j=i+1;j<arr.length;j++){
                sum = sum+arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    public static int maxSubArraySumRec(int[] arr,int start,int end){

        if(start == end)
        {
            System.out.println("test");
            return arr[start];
        }


        int mid = (start+end)/2;
        int left = maxSubArraySumRec(arr,start,mid);
        int right = maxSubArraySumRec(arr,mid+1,end);
        int res = maxInSubArray(arr,start,mid,end);
        return Math.max(res,Math.max(left,right));

    }

    public static int maxInSubArray(int[] arr,int start,int mid,int end){
        int leftTotal = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=mid;i>=start;i--){
            sum+=arr[i];
            if (sum > leftTotal)
                leftTotal = sum;
        }
        int rightTotal = Integer.MIN_VALUE;
        sum = 0;
        for(int j=mid+1;j<=end;j++){
            sum+=arr[j];
            if (sum > rightTotal)
                rightTotal = sum;
        }
        return leftTotal+rightTotal;
    }

    static int maxCrossingSum(int arr[], int l,
                              int m, int h)
    {
        // Include elements on left of mid.
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--)
        {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        // Include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++)
        {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        // Return sum of elements on left
        // and right of mid
        return left_sum + right_sum;
    }

    // Returns sum of maxium sum subarray
    // in aa[l..h]
    static int maxSubArraySum(int arr[], int l,
                              int h)
    {
        // Base Case: Only one element
        if (l == h)
            return arr[l];

        // Find middle point
        int m = (l + h)/2;

    /* Return maximum of following three
    possible cases:
    a) Maximum subarray sum in left half
    b) Maximum subarray sum in right half
    c) Maximum subarray sum such that the
    subarray crosses the midpoint */
        return Math.max(Math.max(maxSubArraySum(arr, l, m),
                maxSubArraySum(arr, m+1, h)),
                maxCrossingSum(arr, l, m, h));
    }

    static int kadaneMaxSum(int[] arr){
        int maxSum = 0;
        int maxSumNow = 0;
        for(int i:arr){
            maxSumNow += i;
            if(maxSumNow<0){
                maxSumNow = 0;
            }
            if(maxSumNow>maxSum){
                maxSum = maxSumNow;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        //13,-3,-25,20 ,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7
        int[] arr = {13,-3,-25,20 ,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(kadaneMaxSum(arr));
    }
}
