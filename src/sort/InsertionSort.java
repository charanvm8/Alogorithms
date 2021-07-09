package sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){

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

        String s = "Chaan";
        String q = "HarshaCharanDileep";
        System.out.println(q.indexOf(s)== -1);
    }
}
