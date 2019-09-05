package sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int arrlen = arr.length;
        for(int i=1;i<arrlen;i++){
            int pres = arr[i];
            int counter = i-1;
            while(counter>-1 && pres<arr[counter]){
                arr[counter+1]=arr[counter];
                counter--;
            }
            arr[counter+1] = pres;
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
        int arr[] = { 12, 11, 13, 5, 6 };
        insertionSort(arr);

        printArray(arr,arr.length);
    }
}
