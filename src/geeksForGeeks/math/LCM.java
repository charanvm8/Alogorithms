package geeksForGeeks.math;

public class LCM {

    public static int LCM(int a,int b){
        int gcd = GCD.gcd1(a,b);
        return (a*b)/gcd;
    }
}
