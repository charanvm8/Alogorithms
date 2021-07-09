package sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        boolean sorted;
        for(int i=0;i<len;i++){
            sorted = true;
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    sorted=false;
                }
            }
            if(sorted){
                return;
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
