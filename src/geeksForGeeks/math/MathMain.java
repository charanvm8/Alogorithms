package geeksForGeeks.math;

import java.util.ArrayList;

public class MathMain {

    public static void main(String[] args) {
        int num = 344433535;
        //System.out.println((int)Math.floor(Math.log10(num)+1));
        //System.out.println(Math.ab);

        // GP of term
        GPTerm gp = new GPTerm();
//        System.out.println(gp.termOfGP(87,93,5));
//        System.out.println(gp.termOfGP(73,37,2));

//        Primality p = new Primality();
//        System.out.println(p.isPrime(27));

//        QuadraticRoots qr = new QuadraticRoots();
//        qr.quadraticRoots(-264, -750,504);
//        qr.quadraticRoots(83, 720,621);

//        IsPrime is = new IsPrime();
//        is.isPrime(37);
//        ArrayList<String> result = new ArrayList();
//        String s = "cha";
//        System.out.println(s.substring(0,2));
//        System.out.println(ExactlyThree.exactly3Divisors(67));
        //AllDivisors.printDivisors1(30);
        boolean[] res = PrimeNumbersTill.primeNumbersTillN(23);
        for(int i=1;i<res.length;i++){
            if(res[i]){
                System.out.println(i);
            }
        }
    }
}
