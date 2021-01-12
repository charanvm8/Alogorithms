package geeksForGeeks.sorting.theory;

import utility.PrintArray;

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

    public static void main(String[] args) {
        int[] arr = {10,5,8,20,2,18};
        selectionSort(arr);
        PrintArray.printArray(arr);
    }
}
