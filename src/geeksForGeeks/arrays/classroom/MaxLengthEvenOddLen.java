package geeksForGeeks.arrays.classroom;

public class MaxLengthEvenOddLen {

    public static int maxLenEvenOdd1(int[] arr){
        int res = 1;
        int currRes = 1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])%2==1){
                res = Math.max(++currRes,res);
            }
            else{
                currRes = 1;
            }
        }
        return res;
    }

}
