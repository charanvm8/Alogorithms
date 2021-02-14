package geeksForGeeks.sorting.theory;

import utility.PrintArray;

import java.util.Arrays;

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

    public static int partitionNaive(int[] arr,int index){
        int len = arr.length;
        int[] res = new int[len];
        int counter = 0;
        int compareVal = arr[index];
        for(int i=0;i<len;i++){
            if(arr[i]<compareVal){
                res[counter++] = arr[i];
            }
        }
        int mid = counter;
        for(int j=0;j<len;j++){
            if(arr[j]>compareVal){
                res[counter++] = arr[j];
            }
        }
        res[len-1] = res[mid];
        res[mid] = compareVal;
        PrintArray.printArray(res);
        return mid;
    }

    public static int countInversions(int[] arr,int start,int end){
        int res = 0;
        if(start>=end){
            int mid = (start+end)/2;
            res+=countInversions(arr,start,mid);
            res+=countInversions(arr,mid+1,end);
            res+=mergeInversions(arr,start,end);
        }
        return res;
    }

    public static int mergeInversions(int[] arr,int start,int end){
        int mid = (start+end)/2;
        int[] leftArr = new int[mid-start+1];
        int[] rightArr = new int[end-mid];
        for(int i=start;i<=mid;i++){
            leftArr[i] = arr[i];
        }
        for(int i=mid+1;i<=end;i++){
            rightArr[i] = arr[i];
        }
        int leftStart = 0;
        int rightStart = 0;
        int resCounter = 0;
        int counter = 0;
        while(leftStart<leftArr.length && rightStart<rightArr.length){
            if(leftArr[leftStart]<=rightArr[rightStart]){
                arr[resCounter++] = leftArr[leftStart++];
            }
            else{
                arr[resCounter++] = rightArr[rightStart++];
                counter+=leftArr.length-1-leftStart;
            }
        }
        while (leftStart<leftArr.length){
            arr[resCounter++] = leftArr[leftStart++];
        }
        while (rightStart<rightArr.length){
            arr[resCounter++] = rightArr[rightStart++];
        }
        return counter;
    }

    public static int lomutoPartition(int[] arr,int currLow,int high){
        int pivot = arr[high];
        int currIndex = -1;
        for(int i=currLow;i<=high-1;i++){
            if(arr[i]<=pivot){
                currIndex++;
                int temp = arr[i];
                arr[i] = arr[currIndex];
                arr[currIndex] = temp;
            }
        }
        currIndex++;
        int temp = arr[currIndex];
        arr[currIndex] = pivot;
        arr[high] = temp;
        return currIndex;
    }

    public static int hoaresPartition(int[] arr,int left,int right){
        int pivot = arr[0];
        int leftTrack = left-1;
        int rightTrack = right+1;
        while (true){
            do{
                leftTrack++;
            }
            while (arr[leftTrack]<pivot);
            do{
                rightTrack--;
            }
            while (arr[rightTrack]>=pivot);
            if(leftTrack==rightTrack){
                return leftTrack;
            }
            int temp = arr[leftTrack];
            arr[leftTrack] = arr[rightTrack];
            arr[rightTrack] = temp;
        }
    }

    public static int kthSmallest(int[] arr,int pos){
//        Arrays.sort(arr);
//        return arr[pos-1];
        int low = 0, pivot = arr.length-1;
        while (true){
            int currPivotVal = arr[pivot];
            int currLow = low-1;
            for(int i=low;i<pivot-1;i++){
                if(arr[i]<currPivotVal){
                    currLow++;
                    int temp = arr[i];
                    arr[i] = arr[currLow];
                    arr[currLow] = temp;
                }
            }

            int temp = arr[pivot];
            arr[pivot] = arr[currLow+1];
            arr[currLow+1] = temp;
            if(currLow+1==pos-1){
                return arr[currLow+1];
            }
            if(currLow+1>=pos-1){
                pivot = currLow;
            }
            else{
                low = currLow+1;
            }
        }
    }




    public static void main(String[] args) {
//        int[] arr = {10,15,20};
//        int[] arr2 = {5,6,6,15};
//        mergeTwoSorted(arr,arr2);

//        int[] arr = {10,15,20,11,30};
//        sortWithIndexes(arr,0,2,4);

//        int[] arr = {7,3,8,6,12,10};
//        System.out.println(hoaresPartition(arr,0,arr.length-1));

//        int[] arr1 = {3,8,6,12,10,7};
//        System.out.println(partitionNaive(arr1,5));
        int[] arr = {10,5,30,12};
        System.out.println(kthSmallest(arr,2));
    }
}
