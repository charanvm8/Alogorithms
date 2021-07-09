package geekForGeeks.dp;

public class DynamicProgramming {

    public int coinChange(int[] coins,int sum,int index){
        if(sum==0){
            return 1;
        }
        int count = coinChange(coins,sum,index-1);
        if(coins[index]<=sum){
            count+=coinChange(coins,sum-coins[index],index);
        }
        return count;
    }



    public int maxCuts(int value, int a, int b, int c){
        if(value<0){
            return -1;
        }
        if(value == 0){
            return 0;
        }
        int res = Math.max(maxCuts(value-a,a,b,c),
                    Math.max(maxCuts(value-b,a,b,c),
                             maxCuts(value-c,a,b,c)));

        if(res==-1){
            return -1;
        }
        return 1+res;
    }


    public int maxCutsTab(int n,int a,int b,int c){
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = -1;
            if(i-a>=0) dp[i] = Math.max(dp[i],dp[i-a]);
            if(i-b>=0) dp[i] = Math.max(dp[i],dp[i-b]);
            if(i-c>=0) dp[i] = Math.max(dp[i],dp[i-c]);
            if(dp[i]!=-1){
                dp[i]++;
            }
        }
        return dp[n];
    }

    public int minCoins(int[] coins,int target, int index){
        if(target==0){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(target-coins[i]>=0){
                int currRes = minCoins(coins,target-coins[i],index);
                if(res!=Integer.MAX_VALUE){
                    res = Math.min(res,currRes+1);
                }
            }
        }
        return res;
    }


    public static int minCoins(int[] coins,int target){
        int[] dp = new int[target+1];
        dp[0]=0;
        for(int i=1;i<=target;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    int currMin = dp[i-coins[j]];
                    if(currMin!=Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i],currMin+1);
                    }
                }
            }
        }
        return dp[target];
    }

    public static int minJumps(int[] arr,int currIndex){
        if(currIndex>=arr.length){
            return Integer.MAX_VALUE;
        }
        if(currIndex==arr.length-1){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int j=currIndex;j<arr.length;j++){
            int currRes = minJumps(arr,currIndex+j+1);
            if(res!=Integer.MAX_VALUE){
                res = Math.min(res,currRes+1);
            }
        }
        return res;
    }

    static class Point{
        int v;
        int w;
        Point(int v,int w){
            this.v = v;
            this.w = w;
        }
    }

    public static int knapsack(Point[] points,int capacity,int currIndex){
        if(capacity==0 || currIndex>=points.length){
            return 0;
        }
        int res = knapsack(points,capacity,currIndex+1);
        if(points[currIndex].w<=capacity){
            res = Math.max(res,points[currIndex].v+knapsack(points,capacity-points[currIndex].w,currIndex+1));
        }
        return res;
    }

    public static int knapsack(Point[] points,int capacity){
        return 10;
    }


    // resuse the solutions of sub problems when there are overlapping subproblems
    // memoization
    // tabulation


    public static int fib(int n){
        int[] mem = new int[n+1];
        mem[1] = 1;
        for(int i=2;i<=n;i++){
            mem[i] = mem[i-1]+mem[i-2];
        }
        return mem[n];
    }


    public static int fibRec(int n){
        int[] mem = new int[n+1];
        return fibRec(n,mem);
    }

    public static int fibRec(int n,int[] mem){
        if(n==0 || n==1){
            return n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        else{
            mem[n] = fibRec(n-1)+fibRec(n-2);
        }
        return mem[n];

    }

    public static int longestSubSeq(String s1, String s2){
        return longestSubSeq(s1, s2, s1.length()-1, s2.length()-1);
    }

    public static int longestSubSeq(String s1, String s2, int leftIndex, int rightIndex){
        if(leftIndex<0 || rightIndex<0){
            return 0;
        }
        if(s1.charAt(leftIndex) == s2.charAt(rightIndex)){
            return 1+longestSubSeq(s1,s2,--leftIndex,--rightIndex);
        }
        else{
            return Math.max(longestSubSeq(s1,s2,--leftIndex,rightIndex),
                    longestSubSeq(s1,s2,leftIndex,--rightIndex));
        }
    }

    public static int longestCommonSubSequence(String s1,String s2){
        int[][] mem = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s1.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    mem[i][j] = 1+mem[i-1][j-1];
                }
                else{
                    mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }

    public static int coinCount(int[] coins,int index, int target){
        if(index == coins.length){
            return 0;
        }
        if(target==0){
            return 1;
        }
        int numberOfWays = coinCount(coins,index+1,target);
        if(coins[index]<=target){
            numberOfWays += coinCount(coins,index,target-coins[index]);
        }
        return numberOfWays;
    }

    public static int coinCount(int[] coins, int target){
        int[][] dp = new int[target+1][coins.length+1];
        for(int i=0;i<=coins.length;i++){
            dp[0][i] = 1;
        }
        for(int i=1;i<=target;i++){
            for(int j=1;j<=coins.length;j++){
                dp[i][j] = dp[i][j-1];
                if(i>=coins[j-1]){
                    dp[i][j] += dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[target][coins.length];
    }

    // O(nlogn)
    public static int longestIncreasingSubSeq(int[] arr){
        int[] subSeq = new int[arr.length];
        subSeq[0] = arr[0];
        int endIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>subSeq[endIndex]){
                subSeq[++endIndex] = arr[i];
            }
            else{
                int search = binarySearch(subSeq,0,endIndex,arr[i]);
                subSeq[search] = arr[i];
            }
        }
        return endIndex+1;
    }



    public static int binarySearch(int[] subSeq, int start, int end, int value){
        while(start<end){
            int mid = start+(end-start)/2;
            if(subSeq[mid]>value){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
//        int[] test = {25,10,5};
//        System.out.println(minCoins(test,40));
//
//        int[] test1 = {3,4,2,1,2,1};
//        System.out.println(minJumps(test1,0));

//        Point[] points = {new Point(10,5),new Point(40,4),new Point(30,6),new Point(50,3)};
//        System.out.println(knapsack(points,10,0));
//
//        PriorityQueue<Integer> testing = new PriorityQueue<>();
//        testing.add(10);
//        testing.add(20);
//        System.out.println(testing.poll());
//        System.out.println(fibRec(20));
//        System.out.println(longestCommonSubSequence("ACCDGH","ACCDGH"));
//
//        String z = "VARDHAN";
//        System.out.println();
//        int[] coins = {2,5,3,6};
//        System.out.println(coinCount(coins,10));
        int[] arr = {8,100,150,10,12,14,110};
        System.out.println(longestIncreasingSubSeq(arr));
    }
}
