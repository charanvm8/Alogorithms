package geeksForGeeks.arrays.classroom;

public class MaxSubArray {

    public static int maxSubArray1(int[] arr){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currTotal = 0;
            for(int j=i;j<arr.length;j++){
                currTotal+=arr[j];
                System.out.print(currTotal+" ");
            }
            System.out.println();
        }
        return res;
    }

    public static int maxSubArray(int[] arr){
        int res = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.max(arr[i],arr[i-1]+arr[i]);
            res = Math.max(res,arr[i]);
        }
        return res;
    }
}
