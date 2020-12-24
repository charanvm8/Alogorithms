package dynamicProgramming.classroom;

public class MinCoins {

    public static int minCoins(int[] arr,int val){
        if(val==0){
            return 0;
        }
        int res1 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(val>=arr[i]){
                res1 = Math.min(res1,1+minCoins(arr,val-arr[i]));
            }
        }
        return res1;
    }

    public static void main(String[] args) {
        int[] arr = {25,10,5};
        System.out.println(minCoins(arr,30));
    }
}
