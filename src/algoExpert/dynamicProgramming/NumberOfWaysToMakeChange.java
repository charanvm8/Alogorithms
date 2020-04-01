package algoExpert.dynamicProgramming;

public class NumberOfWaysToMakeChange {

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] res = new int[n+1];
        res[0] = 1;

        for(int i=0;i<denoms.length;i++){
            for(int j=1;j<=n;j++){
                if(j>=denoms[i]){
                    res[j]=res[j]+res[j-denoms[i]];
                }
            }
        }
        return res[n];
    }

    public static void main(String[] args) {
        int[] arr= {1,5};
        System.out.print(numberOfWaysToMakeChange(6,arr));

    }
}
