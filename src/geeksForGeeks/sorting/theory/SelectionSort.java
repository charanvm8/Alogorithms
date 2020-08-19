package geeksForGeeks.sorting.theory;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lowest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[lowest]>arr[j]){
                    lowest = j;
                }
            }
            int temp = arr[lowest];
            arr[lowest] = arr[i];
            arr[i] = temp;
        }
    }
}
