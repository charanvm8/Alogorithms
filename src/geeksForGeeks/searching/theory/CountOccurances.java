package geeksForGeeks.searching.theory;

public class CountOccurances {


    public static int countOccurrances(int[] arr,int target){
        int getStartPosition = getFirstOccurance(arr,0,arr.length-1,target);
        int getFinalPosition = getEndOccurance(arr,0,arr.length-1,target,arr.length);
        return (getFinalPosition-getStartPosition)+1;
    }

    // First Occurrence
    public static int getFirstOccurance(int[] arr, int start,int end,int target){
        if(start<=end){
            int mid = start+((end-start)/2);
            if(mid==0 || (arr[mid-1]<target && arr[mid]==target)){
                return mid;
            }
            else if(arr[mid]>=target){
                return getFirstOccurance(arr,start,mid-1,target);
            }
            else{
                return getFirstOccurance(arr,mid+1,end,target);
            }

        }
        return -1;
    }

    // End Occurrence
    public static int getEndOccurance(int[] arr, int start,int end,int target,int endIndex){
        if(start<=end){
            int mid = start+((end-start)/2);
            if(mid==endIndex-1 || (arr[mid]==target && arr[mid+1]>target)){
                return mid;
            }
            else if(arr[mid]>target){
                return getEndOccurance(arr,start,mid-1,target,endIndex);
            }
            else {
                return getEndOccurance(arr,mid+1,end,target,endIndex);
            }
        }
        return -1;
    }

    public static int getOneOccurrence(int[] arr,int start,int end){
        int firstOcc = -1;
        while(start<=end){
            int mid = start+((end-start))/2;
            if(mid==0 || (arr[mid-1]==0 && arr[mid]==1)){
                firstOcc = mid;
                break;
            }
            else if(arr[mid] == 1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return firstOcc;
    }
}
