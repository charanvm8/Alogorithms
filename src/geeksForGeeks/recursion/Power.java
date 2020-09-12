package geeksForGeeks.recursion;

public class Power {

    static long power(int N,int R)
    {
        long res = getPower(N,R);
        System.out.println(res);
        return res%1000000007;

    }

    static long getPower(int n,int r){
        if(r==0){
            return 1;
        }
        long power = getPower(n,r/2);
        long res = power*power;
        if(r%2==0){
            return res;
        }
        else{
            return res*res;
        }
    }
}
