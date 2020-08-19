package geeksForGeeks.sorting.theory;

public class QuickSort {

    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pos = sort(arr,start,end);
            quickSort(arr,start,pos-1);
            quickSort(arr,pos+1,end);
        }
    }

    private static int sort(int[] arr,int start,int end){
        int pivot = arr[end];
        int pos = start;
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }

        }
        arr[end] = arr[pos];
        arr[pos] = pivot;
        return pos;
    }
}
