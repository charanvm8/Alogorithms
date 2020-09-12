package geeksForGeeks.recursion;

public class Josephus {

    public static int josephus(int total,int killAt){
        if(total==1){
            return 0;
        }
        else{
            return (josephus(total-1,killAt)+killAt)%total;
        }
    }
}
