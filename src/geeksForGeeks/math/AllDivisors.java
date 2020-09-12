package geeksForGeeks.math;

public class AllDivisors {

    // Naive Solution
    public static void printDivisors1(int n){
        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        i--;
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
}
