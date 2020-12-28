package dynamicProgramming.classroom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

//    // Memoization
//    static int[] arr = new int[100];
//    public static int fibMem(int n)
//    {
//        if(n==0 || n==1){
//            return n;
//        }
//        if(arr[n]!=0){
//            return arr[n];
//        }
//        else{
//            arr[n] = fibMem(n-1)+fibMem(n-2);
//        }
//        return arr[n];
//    }
//
//    // Tabulation
//    public static int fibMemTabulation(int n){
//        int[] arr = new int[n];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i=2;i<n;i++){
//            arr[i] = arr[i-1]+arr[i-2];
//        }
//        return arr[n-1];
//    }

    static int[] mem = new int[100];
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        mem[n] = fib(n-1)+fib(n-2);
        return mem[n];
    }

    public static int fib2(int n){
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        for(int i=2;i<=n;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(fib2(8));
    }
}
