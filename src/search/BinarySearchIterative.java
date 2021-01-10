package search;

public class BinarySearchIterative {

    public static int binarySearchIterative(int[] arr,int start,int end,int value){
        while (start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid]>value){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {20,30,40};
        int end = arr.length;
        System.out.println(binarySearchIterative(arr,0,end,40));
    }
}
