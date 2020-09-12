package geeksForGeeks.math;

import java.util.Arrays;

public class PrimeNumbersTill {

    public static boolean[] primeNumbersTillN(int n){
        boolean[] arr= new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n+1;i++){
            if(arr[i]){
                int temp = i*i;
                while (temp<=n){
                    arr[temp] = false;
                    temp+=i;
                }
            }
        }
        return arr;
    }
}
