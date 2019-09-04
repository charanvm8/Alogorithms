package sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSorted;
        for(int i=0;i<n-1;i++){
            isSorted = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted){
                break;
            }
        }
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
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
