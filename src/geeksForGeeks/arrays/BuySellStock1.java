package geeksForGeeks.arrays;

public class BuySellStock1 {

    public static int buySellStock1(int[] arr,int start,int end){
        //Naive Solution
        if(start>=end){
            return 0;
        }
        int profit = 0;
        for(int i=0;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int currProfit = arr[j]-arr[i]+buySellStock1(arr,start,i-1)+buySellStock1(arr,j+1,end);
                    profit = Math.max(profit,currProfit);
                }
            }
        }
        return profit;

    }
}
