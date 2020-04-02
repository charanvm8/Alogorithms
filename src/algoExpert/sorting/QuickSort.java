package algoExpert.sorting;

public class QuickSort {

    public static int[] quickSort(int[] array) {
        int len = array.length-1;
        quickSortArray(array,0,len);
        return array;
    }

    public static void quickSortArray(int[] arr,int start,int end){
        if(end>start){
            int pivot = sort(arr,start,end);
            quickSortArray(arr,start,pivot-1);
            quickSortArray(arr,pivot+1,end);
        }
    }

    public static int sort(int[] arr,int start,int end){
        int temp = arr[end];
        int pivot = end;
        for(int i=end-1;i>=start;i--){
            if(arr[i]>temp){
                int track = i;
                while(track!=pivot){
                    int store = arr[track+1];
                    arr[track+1] = arr[track];
                    arr[track]=store;
                    track++;
                }
                pivot--;
            }
        }
        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int[] result = quickSort(arr);
        for(int i:result){
            System.out.println(i);
        }
    }
}
