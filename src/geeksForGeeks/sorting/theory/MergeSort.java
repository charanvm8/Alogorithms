package geeksForGeeks.sorting.theory;

public class MergeSort {
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int mid = start+((end-start)/2);
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr,int start,int mid,int end){
        int leftTotal = mid-start+1;
        int rightTotal = end-mid;
        int[] leftArr = new int[leftTotal];
        int[] rightArr = new int[rightTotal];
        for(int i=0;i<leftTotal;i++){
            leftArr[i] = arr[start+i];
        }
        for(int j=0;j<rightTotal;j++){
            rightArr[j] = arr[mid+1+j];
        }
        int leftCounter = 0;
        int rightCounter = 0;
        int counter = start;
        while(leftCounter<leftTotal && rightCounter<rightTotal){
            if(leftArr[leftCounter]<rightArr[rightCounter]){
                arr[counter++] = leftArr[leftCounter++];
            }
            else{
                arr[counter++] = rightArr[rightCounter++];
            }
        }
        while (leftCounter<leftTotal){
            arr[counter++] = leftArr[leftCounter++];
        }
        while (rightCounter<rightTotal){
            arr[counter++] = rightArr[rightCounter++];
        }
    }
}
