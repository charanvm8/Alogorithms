package sort;

public class QuickSort {

    static void quickSort(int[] arr,int start,int end){
        if(end>start){
            int pivotIndex = sort(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }

    static int sort(int arr[],int start,int end){
        int pivotIndex = start;
        int pivot = arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        arr[end] = temp;
        return pivotIndex;
    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
