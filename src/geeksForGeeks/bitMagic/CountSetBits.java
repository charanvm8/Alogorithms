package geeksForGeeks.bitMagic;

public class CountSetBits {


    public static int countSetBits1(int n){
        int sum = 0;
        while (n!=0){
            if((n&1)==1){
                sum++;
            }
            n >>= 1;
        }
        return sum;
    }


}
