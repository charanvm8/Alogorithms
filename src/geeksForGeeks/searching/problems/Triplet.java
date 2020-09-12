package geeksForGeeks.searching.problems;

import java.util.Arrays;

public class Triplet {

    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<2;i++){
            sum+=arr[i];
        }
        if(sum==0){
            return true;
        }
        for(int i=3;i<n;i++){
            sum=sum+arr[i]-arr[i-3];
            if(sum==0){
                return true;
            }
        }
        return false;
    }
}
