package geeksForGeeks.arrays.classroom;

public class BuyStockAndSell1 {
    public static int buyStockAndSell(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
