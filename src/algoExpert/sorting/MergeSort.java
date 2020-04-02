package algoExpert.sorting;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        merge(array,0,array.length-1);
        return array;
    }

    public static void merge(int[] arr,int start,int end){
        if(end>start){
            int mid = (end+start)/2;
            merge(arr,start,mid);
            merge(arr,mid+1,end);
            sort(arr,start,mid,end);
        }
    }

    public static void sort(int[] arr,int start,int mid,int end){
        System.out.println(start+"---"+mid+"---"+end);
        int[] leftArr = new int[mid-start+1];
        int[] rightArr = new int[end-mid];
        int leftCounter = 0;
        int rightCounter = 0;
        for(int i=start;i<mid+1;i++){
            leftArr[leftCounter++]=arr[i];
        }
        for(int j=mid+1;j<=end;j++){
            rightArr[rightCounter++]=arr[j];
        }
        int leftArrCounter = 0;
        int rightArrCounter = 0;
        int arrCounter = start;
        while(arrCounter<=end && leftCounter!=leftArrCounter && rightCounter!=rightArrCounter){
            if(leftArr[leftArrCounter]<=rightArr[rightArrCounter]){
                arr[arrCounter]=leftArr[leftArrCounter++];
            }
            else{
                arr[arrCounter]=rightArr[rightArrCounter++];
            }
            arrCounter++;
        }
        while(arrCounter<=end && leftCounter!=leftArrCounter){
            arr[arrCounter]=leftArr[leftArrCounter++];
            arrCounter++;
        }
        while(arrCounter<=end && rightCounter!=rightArrCounter){
            arr[arrCounter]=rightArr[rightArrCounter++];
            arrCounter++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-4, 5, 10, 8, -10, -6, -4, -2, -5, 3, 5, -4, -5, -1, 1, 6, -7, -6, -7, 8};
        int[] result = mergeSort(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
