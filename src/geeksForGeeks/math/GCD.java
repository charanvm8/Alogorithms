package geeksForGeeks.math;

public class GCD {

    public static int gcdNaive(int a,int b){
        int lowest = Math.min(a,b);

        while(lowest>2){
            if(lowest%b==0 && lowest%a==0){
                return lowest;
            }
            lowest--;
        }
        return 1;
    }


    public static int gcd(int a,int b){
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        else{
            return gcd(b-a,a);
        }
    }

    public static int gcd1(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd1(b,a%b);
        }
    }


}
