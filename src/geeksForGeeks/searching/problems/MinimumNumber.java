package geeksForGeeks.searching.problems;

public class MinimumNumber {

    static long minNumber(int arr[], long low, long high)
    {
        long leastVal = Integer.MAX_VALUE;
        while(low<=high){
            long mid = low+((high-low)/2);
            leastVal = Math.min(arr[(int)mid],leastVal);
            if((arr[(int)mid]>arr[(int)low] && arr[(int)mid]<arr[(int)high]) || arr[(int)mid]<arr[(int)low] ){
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return leastVal;
    }

}
