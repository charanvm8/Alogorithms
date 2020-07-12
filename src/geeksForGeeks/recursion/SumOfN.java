package geeksForGeeks.recursion;

public class SumOfN {

    public int sumTillN(int n){
        if(n==1){
            return 1;
        }
        return n+sumTillN(n-1);
    }
}
