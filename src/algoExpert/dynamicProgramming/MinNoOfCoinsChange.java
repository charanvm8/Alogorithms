package algoExpert.dynamicProgramming;

public class MinNoOfCoinsChange {

    public static int memMinCoins(int V,int m,int[] coins){
        int[] mem = new int[V];
        minCoins(V,m,coins,mem);
        return mem[V-1];
    }

    public static int minCoins(int V,int m,int[] coins,int[] mem){
        if (V == 0) return 0;

        if(mem[V-1]!=0){return mem[V-1];}

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i=0; i<m; i++)
        {
            if (coins[i] <= V)
            {
                int sub_res = minCoins(V-coins[i],m,coins,mem);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (sub_res != -1 && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        if(res==Integer.MAX_VALUE){
            mem[V-1]=-1;
            return -1;
        }
        else{
            mem[V-1]=res;
            return res;
        }
    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {

        int[] res = new int[n+1];
        for(int k=1;k<res.length;k++){
            res[k] = Integer.MAX_VALUE;
        }
        for(int i=0;i<denoms.length;i++){
            for(int j=1;j<=n;j++){
                if(j==denoms[i]){
                    res[j] = 1;
                }
                else if(j>=denoms[i] && res[j-denoms[i]]!=Integer.MAX_VALUE && res[denoms[i]]!=Integer.MAX_VALUE){
                    res[j]=Math.min(res[j-denoms[i]]+res[denoms[i]],res[j]);
                }
            }
        }
        return res[n]==Integer.MAX_VALUE?-1:res[n];
    }

    public static void main(String[] args) {
        int[] inputArr =  {2,1};
        int z = minNumberOfCoinsForChange(3,inputArr);
        System.out.println(z);
    }
}
