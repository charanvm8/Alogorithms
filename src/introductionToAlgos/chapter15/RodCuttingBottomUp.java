package introductionToAlgos.chapter15;

public class RodCuttingBottomUp {

    public static int maxRevBottomUp(int[] arr,int rodLength){
        int[] mem = new int[arr.length+1];
        for(int i=1;i<=rodLength;i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<=i;j++){
                max = Math.max(max,arr[j-1]+mem[i-j]);
            }
            System.out.println();
            mem[i]=max;
        }
        return mem[rodLength];
    }

    public static void main(String[] args) {
        int[] prices = {1,5,8,9,10,17,17,20,24,30};
        int z = maxRevBottomUp(prices,10);
    }
}
