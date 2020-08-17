package geeksForGeeks.arrays.problems;

public class ReverseArrByK {

    static void rotateArr(int arr[], int d, int n)
    {

        rotate(arr,0,n-1);
        rotate(arr,0,n-1-d);
        rotate(arr,n-d,n-1);
    }

    static void rotate(int[] arr,int start,int end){
        int mid = start+((end-start)/2);
        int lastIndex = end;
        for(int i=start;i<=mid;i++){
            int temp = arr[i];
            arr[i] = arr[lastIndex];
            arr[lastIndex--] = temp;
        }
    }
}
