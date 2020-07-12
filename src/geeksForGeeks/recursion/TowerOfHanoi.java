package geeksForGeeks.recursion;

public class TowerOfHanoi {


    public static void towerOfHanoi(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move disc "+n+" from "+A+" to "+C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println("Move disc "+n+" from "+A+" to "+C);
        towerOfHanoi(n-1,B,A,C);
    }
}
