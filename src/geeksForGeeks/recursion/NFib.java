package geeksForGeeks.recursion;

public class NFib {

    public int nFib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return nFib(n-1)+nFib(n-2);
    }
}
