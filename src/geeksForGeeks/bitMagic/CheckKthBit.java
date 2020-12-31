package geeksForGeeks.bitMagic;

public class CheckKthBit {

    public static int brains(int k){
        if(k==0){
            return 0;
        }
        int count=0;
        while(k>0){
            count++;
            k = k&(k-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(brains(40));
    }
}
