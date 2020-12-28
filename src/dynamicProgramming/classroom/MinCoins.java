package dynamicProgramming.classroom;

public class MinCoins {

    public static int minCoins(int[] arr,int val,int index){
        if(index==0){
            return 0;
        }
        int ref = Integer.MAX_VALUE;

        return ref;
    }

    public static void main(String[] args) {
        int[] arr = {25,10,5};
        System.out.println(minCoins(arr,30,arr.length));
    }
}
