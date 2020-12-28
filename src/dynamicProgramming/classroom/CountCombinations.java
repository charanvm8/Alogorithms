package dynamicProgramming.classroom;

import utility.PrintArray;

public class CountCombinations {

    public static int result = 0;

//    public static int maxCombinations(int[] coins,int target){
//        if(target<0){
//            return -1;
//        }
//        if(target==0){
//            return 1;
//        }
//
//        for(int i=0;i<coins.length;i++){
//            if(target>=coins[i]){
//                int res = maxCombinations(coins,target-coins[i]);
//                if(res==1){
//                    result++;
//                }
//            }
//        }
//        return result;
//    }

    public static int coinChange(int[] coins,int target,int index){
        if(index==-1){
            return 0;
        }
        if(target==0){
            return 1;
        }
        int maxValue=coinChange(coins,target,index-1);
        if(coins[index]<=target){
            maxValue+=coinChange(coins,target-coins[index],index);
        }
        return maxValue;
    }

    public static int coinChange1(int[] coins,int target){
        int[][] coinChange = new int[target+1][coins.length+1];
        for(int i=0;i<=coins.length;i++){
            coinChange[0][i] = 1;
        }
        for(int i=1;i<=target;i++){
            for(int j=1;j<=coins.length;j++){
                coinChange[i][j] = coinChange[i][j-1];
                if(coins[j-1]<=i){
                    coinChange[i][j]+=coinChange[i-coins[j-1]][j];
                }
            }
        }
        return coinChange[target][coins.length];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        //System.out.println(coinChange(coins,10,coins.length-1));
        System.out.println(coinChange1(coins,4));
    }
}
