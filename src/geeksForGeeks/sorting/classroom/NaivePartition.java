package geeksForGeeks.sorting.classroom;

public class NaivePartition {

    public static void naivePartition(int[] arr,int target){
        int curr = 0;
        int val = arr[target];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<val){
                int temp = arr[i];
                arr[i] = arr[curr];
                arr[curr] = temp;
                curr++;
            }
        }
        arr[target] = arr[curr];
        arr[curr] = val;
    }
}
