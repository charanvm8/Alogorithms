package sort;

public class MergeSortRecursive {

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(" "+i);
        }
    }

    public void sort(int[] arr,int start,int end){
        if(end>start){
             int mid = (end+start)/2;
            sort(arr,0,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int[] arr,int start,int mid,int end){
        System.out.println("inside merge");
        int firstArrSize = (mid-start)+1;
        int secondArrSize = end-mid;
        int[] firstArr = new int[firstArrSize];
        int[] secondArr = new int[secondArrSize];
        for(int i=0;i<firstArrSize;i++){
            firstArr[i] = arr[start+i];
        }
        for(int i=0;i<secondArrSize;i++){
            secondArr[i] = arr[mid+i+1];
        }
        int firstIndex = 0;
        int secondIndex = 0;
        int arrIndex = start;
        while(firstIndex<firstArrSize && secondIndex<secondArrSize){
            if(firstArr[firstIndex]<secondArr[secondIndex]){
                arr[arrIndex++] = firstArr[firstIndex++];
            }
            else{
                arr[arrIndex++] = secondArr[secondIndex++];
            }
        }
        for(int z = firstIndex;z<firstArrSize;z++){
            arr[arrIndex++] = firstArr[firstIndex++];
        }

        for(int z = secondIndex;z<secondArrSize;z++){
            arr[arrIndex++] = secondArr[secondIndex++];
        }

    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

//        System.out.println("Given Array");
//        printArray(arr);

        MergeSortRecursive ob = new MergeSortRecursive();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
