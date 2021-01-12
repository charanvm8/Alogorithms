package geeksForGeeks.sorting.theory;

import utility.PrintArray;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int val = arr[i];
            int prevIndex = i;
            while (prevIndex>0 && arr[prevIndex-1]>val){
                arr[prevIndex] = arr[prevIndex-1];
                prevIndex--;
            }
            arr[prevIndex] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,5,8,20,2,18};
        insertionSort(arr);
        PrintArray.printArray(arr);
    }
}
