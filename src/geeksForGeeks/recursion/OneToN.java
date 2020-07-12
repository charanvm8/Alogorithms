package geeksForGeeks.recursion;

public class OneToN {

    public void oneToN(int z){
        if(z==0){
            return;
        }
        oneToN(z-1);
        System.out.println(z);
    }

    public void nToOne(int z){
        if(z==0){
            return;
        }
        System.out.println(z);
        nToOne(z-1);
    }
}
