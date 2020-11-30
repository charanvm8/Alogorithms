package geeksForGeeks.greedy.classroom.knapsack;

import java.util.Arrays;

public class FractionalKnapSack {

    public static int maxValue(KnapSack[] arr,int capacity){
        Arrays.sort(arr,new KnapComparator());
        int res = 0;
        int currCapacity = capacity;

        for(int i=0;i<arr.length;i++){
            if(currCapacity>=arr[i].weight){
                res += arr[i].value;
                currCapacity -= arr[i].weight;
            }
            else{
                int eachVal = (arr[i].value/arr[i].weight);
                res+= (currCapacity*eachVal);
                return res;
            }
        }
        return res;
    }
}
