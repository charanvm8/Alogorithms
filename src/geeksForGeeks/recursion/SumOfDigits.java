package geeksForGeeks.recursion;

public class SumOfDigits {

    public int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
}
