package geeksForGeeks.sorting.theory;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = i;
            int val = arr[i];
            while(key>0 && arr[key-1]>val){
                arr[key] = arr[key-1];
                key--;
            }
            arr[key] = val;
        }
    }
}
