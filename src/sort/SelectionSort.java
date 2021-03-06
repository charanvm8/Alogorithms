package sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int index = i;
            for(int j=i+1;j<len;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
        printArray(arr);
    }
}
