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
    public static int getSquareRoot(int num){
        int start = 1;
        int end = num;
        int res = -1;
        while (start<end){
            int mid = start+(end-start)/2;
            int square = mid*mid;
            if(square==num){
                return mid;
            }
            if(square>num){
                end= mid;
            }
            else{
                start = mid+1;
                res = mid;
            }
        }
        return res;
    }
}
