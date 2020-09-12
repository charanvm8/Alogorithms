package geeksForGeeks.math;

public class ExactlyThree {

    public static int exactly3Divisors(int N)
    {
        int res = 0;
        for(int i=4;i<=N;i++){
            int counter = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter==1){
                res++;
            }
        }
        return res;
    }
}
