package search;

public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int start,int end, int value){
        if(end>=start){
            int mid = (start+end)/2;
            if(arr[mid] == value){
                return mid;
            }
            if(value>arr[mid]){
                return binarySearch(arr,mid+1,end,value);
            }
            return binarySearch(arr,0,mid-1,value);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {20};
        int end = arr.length;
        System.out.println(binarySearch(arr,0,end,10));
    }
}
