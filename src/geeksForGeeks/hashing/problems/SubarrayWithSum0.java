package geeksForGeeks.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSum0 {

    public static boolean findsum(int arr[],int n)
    {
        //Your code here
        Set<Integer> vals = new HashSet();
        int prefixSum = 0;
        for(int i=0;i<n;i++){

            prefixSum+=arr[i];
            if(prefixSum==0){
                return true;
            }
            if(vals.contains(prefixSum)){
                return true;
            }
            vals.add(arr[i]);
        }
        return false;
    }
}
