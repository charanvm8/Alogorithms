package geeksForGeeks.searching.classroom;

public class SearchInInfiniteLoop {

    public static int searchInInfinite(int[] arr,int target){
        int start = 0;
        int end = 1;
        int prevEnd = 1;
        int res = -1;
        while(start<end){
            if(arr[start]==target){
                return start;
            }
            else if(arr[end]==target){
                return end;
            }
            if(arr[end]<target){
                prevEnd = end;
                end = end*end;

            }
            else{
                start = prevEnd;
            }
        }
        return res;
    }
}
