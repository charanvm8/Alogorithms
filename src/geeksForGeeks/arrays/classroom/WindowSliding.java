package geeksForGeeks.arrays.classroom;

public class WindowSliding {

    public static int windowSliding(int[] arr,int k){
        int res = 0;
        for(int i=0;i<k;i++){
            res+=arr[i];
        }
        int currRes = res;
        for(int i=k;i<arr.length;i++){
            currRes = currRes+arr[i]-arr[i-k];
            res = Math.max(res,currRes);
        }
        return res;
    }

    //
}
