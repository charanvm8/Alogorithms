package geeksForGeeks.searching.theory;

public class BinarySearch {

    public static int binarySearchRec(int[] arr,int start,int end,int ele){
        if(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid] == ele){
                return mid;
            }
            if(arr[mid]>ele){
                return binarySearchRec(arr,start,mid-1,ele);
            }
            else{
                return binarySearchRec(arr,mid+1,end,ele);
            }
        }
        return -1;
    }

    public static int binarySearchIterative(int[] arr,int start,int end,int ele){
        int arrStart = start;
        int arrEnd = end;
        while(arrStart<=arrEnd){
            int mid = arrStart+ (arrEnd-arrStart)/2;
            if(arr[mid]==ele){
                return mid;
            }
            if(arr[mid]>ele){
                arrEnd = mid-1;
            }
            else {
                arrStart = mid+1;
            }
        }
        return -1;
    }
}
