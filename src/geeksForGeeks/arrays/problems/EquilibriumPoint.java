package geeksForGeeks.arrays.problems;

public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int total = 0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        long currTotal = 0;
        for(int i=0;i<arr.length;i++){
            if(currTotal == total-currTotal-arr[i]){
                return i+1;
            }
            currTotal+=arr[i];

        }
        return -1;
    }
}
