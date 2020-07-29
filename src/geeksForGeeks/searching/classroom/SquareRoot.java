package geeksForGeeks.searching.classroom;

public class SquareRoot {

    //Naive Solution
    public static int getRootNaive(int num){
        for(int i=0;i<num;i++){
            if(i*i>num){
                return i-1;
            }
        }
        return 0;
    }

    // Optimized Solution
//    public static int getSquareRoot(int i){
//
//    }
}
