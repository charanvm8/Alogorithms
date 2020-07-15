package geeksForGeeks.math;

public class GPTerm {

    public double termOfGP(int A,int B,int N)
    {
        double ratio = (double) B/A;
        return Math.floor(A*Math.pow(ratio,N-1));
    }
}
