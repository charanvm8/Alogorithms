package search;

public class BinarySearchIterative {

    public static int binarySearchIterative(int[] arr,int start,int end,int value){

        int insideStart = start;
        int insideEnd = end;

        while(insideEnd>=insideStart){
            int mid = (insideEnd+insideStart)/2;
            if(arr[mid]==value){
                return mid;
            }
            if(value>arr[mid]){
                insideStart = mid+1;
            }
            else{
                insideEnd = mid-1;
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
