package geeksForGeeks.sorting.theory;

import utility.PrintArray;

public class MergeSort {
//    public static void mergeSort(int[] arr,int start,int end){
//        if(start<end){
//            int mid = start+((end-start)/2);
//            mergeSort(arr,start,mid);
//            mergeSort(arr,mid+1,end);
//            merge(arr,start,mid,end);
//        }
//    }
//
//    private static void merge(int[] arr,int start,int mid,int end){
//        int leftTotal = mid-start+1;
//        int rightTotal = end-mid;
//        int[] leftArr = new int[leftTotal];
//        int[] rightArr = new int[rightTotal];
//        for(int i=0;i<leftTotal;i++){
//            leftArr[i] = arr[start+i];
//        }
//        for(int j=0;j<rightTotal;j++){
//            rightArr[j] = arr[mid+1+j];
//        }
//        int leftCounter = 0;
//        int rightCounter = 0;
//        int counter = start;
//        while(leftCounter<leftTotal && rightCounter<rightTotal){
//            if(leftArr[leftCounter]<rightArr[rightCounter]){
//                arr[counter++] = leftArr[leftCounter++];
//            }
//            else{
//                arr[counter++] = rightArr[rightCounter++];
//            }
//        }
//        while (leftCounter<leftTotal){
//            arr[counter++] = leftArr[leftCounter++];
//        }
//        while (rightCounter<rightTotal){
//            arr[counter++] = rightArr[rightCounter++];
//        }
//    }


    public static void mergeTwoSorted(int[] arr,int[] arr2){
        int firstIndex = 0;
        int secondIndex = 0;
        int[] res = new int[arr.length+arr2.length];
        int currIndex = 0;
        while (firstIndex<arr.length && secondIndex<arr2.length){
            if(arr[firstIndex]<=arr2[secondIndex]){
                res[currIndex++]=arr[firstIndex++];
            }
            else{
                res[currIndex++]=arr2[secondIndex++];
            }
        }
        for(int i=firstIndex;i<arr.length;i++){
            res[currIndex++]=arr[i];
        }
        for(int i=secondIndex;i<arr2.length;i++){
            res[currIndex++] = arr2[i];
        }
        PrintArray.printArray(res);
    }

    public static void sortWithIndexes(int[] arr,int start,int mid,int high){
        int[] res = new int[high-start];
        int startIndex = start;
        int midIndex = mid+1;
        int currIndex = 0;
        while (startIndex<=mid && midIndex<=high){
            if(arr[startIndex]<=arr[midIndex]){
                res[currIndex++] = arr[startIndex++];
            }
            else{
                res[currIndex++] = arr[midIndex++];
            }
        }
        while(startIndex<=mid){
            arr[currIndex++] = arr[startIndex++];
        }
        while(midIndex<=high){
            arr[currIndex++] = arr[midIndex++];
        }
        PrintArray.printArray(res);

    }

    public static void intersectionOfTwoArrays(int[] arr,int[] arr2){
        int start = 0;
        int end = 0;
        while (start<arr.length && end<arr2.length){
            if(start>0 && arr[start]==arr[start-1]){
                start++;
                continue;
            }
            if(arr[start]==arr[end]){
                System.out.println(arr[start]);
                start++;
                end++;
            }
            else if(arr[start]<arr[end]){
                start++;
            }
            else{
                end++;
            }
        }
    }

    public static void unionOfTwoArrays(int[] arr,int[] arr2){
        int start = 0;
        int end = 0;
        while (start<arr.length && end<arr2.length){
            if(start>0 && arr[start]==arr[start-1]){
                start++;
                continue;
            }
            if(end>0 && arr[end]==arr[end-1]){
                end++;
                continue;
            }
            if(arr[start]==arr[end]){
                System.out.println(arr[start]);
                start++;
                end++;
            }
            else if(arr[start]<arr[end]){
                System.out.println(arr[start]);
                start++;
            }
            else{
                System.out.println(arr[end]);
                end++;
            }
        }
    }

    public static void partitionNaive(int[] arr){
        int len = arr.length;
        int[] res = new int[len];
        int start = 0;
        int end = len-1;
        int pivot = arr[len-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=pivot){
                res[start++] = arr[i];
            }
            else{
                res[end--] = arr[i];
            }
        }
        arr[start] = pivot;
        PrintArray.printArray(res);
    }

    public static void lomutoPartition(int[] arr){
        int last = arr.length-1;
        int pivot = arr[last];
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start++] = temp;
            }
        }
        PrintArray.printArray(arr);

    }


    public static void main(String[] args) {
//        int[] arr = {10,15,20};
//        int[] arr2 = {5,6,6,15};
//        mergeTwoSorted(arr,arr2);

//        int[] arr = {10,15,20,11,30};
//        sortWithIndexes(arr,0,2,4);

        int[] arr = {3,8,6,12,10,7};
        lomutoPartition(arr);
    }
}
