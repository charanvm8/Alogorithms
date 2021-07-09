package sort;

public class MergeSort {

    public static void mergeSort(int[] arr, int start,int end){
        if(end>start){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int[] arr,int start,int mid,int end){
        int[] firstArr = new int[mid-start];
        int[] secndArr = new int[end-mid+1];
        int firstArrCounter = 0;
        int secondArrCounter = 0;
        for(int i=start;i<=mid;i++){
            firstArr[firstArrCounter] = arr[i];
            firstArrCounter++;
        }
        for(int j=end+1;j<=end;j++){
            secndArr[secondArrCounter] = arr[j];
            secondArrCounter++;
        }
        int firstInsertCount = 0;
        int secondInsertCount = 0;
        int arrCounter = start;
        while(firstInsertCount<=firstArrCounter && secondInsertCount<=secondArrCounter){
            if(firstArr[firstInsertCount]<=secndArr[secondInsertCount]){
                arr[arrCounter] = firstArr[firstInsertCount];
                firstInsertCount++;
                arrCounter++;
            }
            else{
                arr[arrCounter] = secndArr[secondInsertCount];
                secondInsertCount++;
                arrCounter++;
            }
        }
//        if()

    }



    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};


    }
}
