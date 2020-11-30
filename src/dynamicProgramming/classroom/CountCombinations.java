package dynamicProgramming.classroom;

public class CountCombinations {

    public static int result = 0;

    public static int maxCombinations(int[] coins,int target){
        if(target<0){
            return -1;
        }
        if(target==0){
            return 1;
        }

        for(int i=0;i<coins.length;i++){
            if(target>=coins[i]){
                int res = maxCombinations(coins,target-coins[i]);
                if(res==1){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {2,5,3};
        System.out.println(maxCombinations(coins,10));
    }
}
