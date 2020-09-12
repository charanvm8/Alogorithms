package geeksForGeeks.math;

public class TrailingZeros {

    //Naive
    public static int trailingZeros(int factorialNumber){
        int factorial = 1;
        for(int i=2;i<=factorialNumber;i++){
            factorial *= i;
        }
        int res = 0;
        while(factorial%10==0){
            res++;
            factorial /= 10;
        }
        return res;
    }

    // Effective Solutions Time complexity Theta(logn)
    public static int trailingZerosUsingFives(int factorialNumber){
        int res = 0;
        for(int i=5;i<=factorialNumber;i*=5){
            res+=Math.floor(factorialNumber/i);
        }
        return res;
    }
}
