package geeksForGeeks.arrays;

public class MaximumDiff {

    public static int maxDiff(int[] arr){
        int least = arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            maxDiff = Math.max(maxDiff,arr[i]-least);
            least = Math.max(least,arr[i]);
        }
        return maxDiff;
    }
}
