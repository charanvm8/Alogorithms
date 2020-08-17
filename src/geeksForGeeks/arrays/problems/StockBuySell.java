package geeksForGeeks.arrays.problems;

public class StockBuySell {

    static void stockBuySell(int price[], int n) {

        // Your code here
        // Your code here
        int start = 0;
        int end = 0;
        boolean profited = false;
        for(int i=1;i<n;i++){
            if(price[i]>price[end]){
                end = i;
            }
            else if(price[i]<price[end] && price[end]>price[start]){
                System.out.print("("+start+" "+end+") ");
                start = i;
                end =i;
                profited = true;
            }
            else if(price[i]==price[end] && end>start){
                end =i;
            }
            else{
                start = i;
                end =i;
            }
        }
        if(price[end]>price[start]){
            System.out.print("("+start+" "+end+") ");
        }
        else if(!profited){
            System.out.print("No Profit");
        }

    }
}
