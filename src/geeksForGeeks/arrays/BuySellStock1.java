package geeksForGeeks.arrays;

public class BuySellStock1 {

    public static int buySellStock1(int[] arr,int start,int end){
        //Naive Solution
        if(end<=start){
            return 0;
        }
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int currProfit = (arr[j]-arr[i])+buySellStock1(arr,start,i-1)+buySellStock1(arr,j+1,end);
                    profit = Math.max(profit,currProfit);
                }
            }
        }
        return profit;
    }

    public static int buySellStock2(int[] arr,int start,int end){
        int profit = 0;
        for(int i=1;i<=end;i++){
            if(arr[i-1]<arr[i]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
