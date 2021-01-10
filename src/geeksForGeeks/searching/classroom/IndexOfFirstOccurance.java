package geeksForGeeks.searching.classroom;

public class IndexOfFirstOccurance {

    //Iterative
    public static int indexOfFirstOcc(int[] arr,int start,int end,int target){
        int firstOcc = Integer.MAX_VALUE;
        while (start<=end){
            int mid = (end+start)/2;
            if(arr[mid]==target){
                firstOcc = Math.min(firstOcc,mid);
                end = mid-1;
                continue;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return firstOcc==Integer.MAX_VALUE?-1:firstOcc;
    }

    //Recursion
    public static int indexOfFirstOccRec(int[] arr,int start,int end,int target){
        if(start>=end){
            return Integer.MAX_VALUE;
        }
        int mid = (end+start)/2;
        if(arr[mid] ==  target){
            int index = indexOfFirstOccRec(arr,start,end-1,target);
            return Math.min(index,mid);
        }
        if(arr[mid]>target){
            return indexOfFirstOccRec(arr,start,mid-1,target);
        }
        else{
            return indexOfFirstOccRec(arr,mid+1,end,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5};
        System.out.println(indexOfFirstOccRec(arr,0,arr.length,5));
    }
}
