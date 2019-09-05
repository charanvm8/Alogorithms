package sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int arrLen = arr.length;
        for(int i=0;i<arrLen-1;i++){
            int key = arr[i];
            int index = i;
            for(int j=i+1;j<arrLen;j++){
                if(key>arr[j]){
                    key = arr[j];
                    index = j;
                }
            }
            if(i!=index){
               int temp = arr[index];
               arr[index] = arr[i];
               arr[i] = temp;
            }
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
