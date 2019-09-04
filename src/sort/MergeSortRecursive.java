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
        int fArrLen = mid-start;
        int sArrLen = (end-mid)-1;
        int[] fArr = new int[fArrLen];
        int[] sArr = new int[sArrLen];
        for(int i=0;i<=fArrLen;i++)
            fArr[i] = arr[start+i];

        for(int k=0;k<=sArrLen;k++)
            sArr[k] = arr[mid+1+k];

        while()
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSortRecursive ob = new MergeSortRecursive();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
