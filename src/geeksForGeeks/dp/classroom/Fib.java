package geeksForGeeks.dp.classroom;

public class Fib {

    static long[] mem = new long[100];

    public static int fib(int x){
        if(x==0 || x == 1){
            return x;
        }
        return fib(x-1)+fib(x-2);
    }

    public static long fibTopDown(int x){
        if (x==0 || x==1){
            return x;
        }
        if(mem[x]!=0){
            return mem[x];
        }
        else {
            mem[x] = fibTopDown(x-1)+fibTopDown(x-2);
            return mem[x];
        }
    }

    public static int fibBottomUp(int x){
        int[] mem = new int[100];
        mem[0] = 0;
        mem[1] = 1;
        for(int i=2;i<=x;i++){
            mem[i] = mem[i-1]+mem[i-2];
        }
        return mem[x];
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibBottomUp(10));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
