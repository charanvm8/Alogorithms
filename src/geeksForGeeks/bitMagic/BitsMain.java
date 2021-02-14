package geeksForGeeks.bitMagic;

import java.util.Stack;

public class BitsMain {

    public static void printBits(int a){
        int temp = a;
        Stack<Integer> bits = new Stack<>();
        while(temp!=0){
            bits.push(1&temp);
            temp>>=1;
        }
        while (!bits.isEmpty()){
            System.out.print(bits.pop()+" ");
        }
        System.out.println();
    }

    public static int swapBits(int n) {
        int curr = 1;
        int prev = 1<<1;
        while(curr<n*n){
            int lastBit = (curr&n);
            int lastPrev = (prev&n);
            if(lastPrev==0 && lastBit>=1){
                n=n^curr;
                n=n|prev;
            }
            else if(lastBit==0 && lastPrev>=1){
                n=n^prev;
                n=n|curr;
            }
            curr<<=2;
            prev<<=2;
        }
        return n;
    }

    public static int numberOfBits(int a,int b){
        int counter = 0;
        while (a!=0 || b!=0){
            counter+= (a&1)^(b&1);
            a>>=1;
            b>>=1;
            System.out.println("*******");
            printBits(a);
            printBits(b);
            System.out.println("*******");
        }
        return counter;
    }

    public static void main(String[] args) {
        int N = 16;
        printBits(N);
        System.out.println(swapBits(N));
        System.out.println(3^2);
//        int test = 12;
//        printBits(test);
//        int test1 = 7;
//        printBits(test1);
//        printBits(test^(test&test1));
//        System.out.println(numberOfBits(test,test1));
        int z = 1;
        System.out.println(z&(z-1));
        String[] numberMap = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        System.out.println(numberMap[2]);
    }
}
