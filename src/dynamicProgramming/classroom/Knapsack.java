package dynamicProgramming.classroom;

import utility.PrintArray;

public class Knapsack {

    public static int knapSack(int[] values,int[] weight,int target,int currIndex){
        if(currIndex==0){
            return 0;
        }
        if(target<=0){
            return 0;
        }
        int secondValue = knapSack(values,weight,target,currIndex-1);
        int firstValue = 0;
        if(weight[currIndex-1]<=target){
            firstValue = values[currIndex-1]+knapSack(values,weight,target-weight[currIndex-1],currIndex-1);
        }
        return Math.max(firstValue,secondValue);
    }

    public static int knapSackI(int[] values,int[] weight,int target,int length){
        int[][] dp = new int[length+1][target+1];
        for(int i=1;i<=length;i++){
            for(int j=1;j<=target;j++){
                if(j>=weight[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j],values[i-1]+dp[i-1][j-weight[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[length][target];

    }

    public static void main(String[] args) {
        int[] values = {10,40,30,50};
        int[] weights = {5,4,6,3};
        System.out.println(knapSackI(values,weights,10,values.length));
    }
}
