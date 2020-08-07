package geeksForGeeks.searching.theory;

public class PeakElements {

    public static int peekElements(int[] arr,int start,int end){
            int mid = start + ((end-start)/2);
            if((mid==0 || (arr[mid]>arr[mid-1]) && (mid==arr.length-1 || arr[mid]>arr[mid+1]))){
                return arr[mid];
            }
            peekElements(arr,start,mid-1);
            peekElements(arr,mid+1,end);
            return 0;
    }
}
