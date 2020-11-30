package dynamicProgramming.classroom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    // Memoization
    static int[] arr = new int[100];
    public static int fibMem(int n)
    {
        if(n==0 || n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        else{
            arr[n] = fibMem(n-1)+fibMem(n-2);
        }
        return arr[n];
    }

    // Tabulation
    public static int fibMemTabulation(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        System.out.println(fibMemTabulation(8));
    }
}
