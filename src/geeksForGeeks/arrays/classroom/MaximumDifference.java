package geeksForGeeks.arrays.classroom;

public class MaximumDifference {

    //Naive
    public static int maxDiff(int[] arr){
        int maxDiff = 0;

        for(int i=0;i<arr.length-1;i++){

        }

        return maxDiff;
    }

    // Optimized
    public static int maxDiff1(int[] arr){
        int maxDiff = Integer.MIN_VALUE;
        int small = arr[0];
        for(int i=1;i<arr.length;i++){
            maxDiff = Math.max(maxDiff,arr[i]-small);
            small = Math.min(small,arr[i]);
        }
        return maxDiff;
    }
}
