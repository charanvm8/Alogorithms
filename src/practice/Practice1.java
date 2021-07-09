package practice;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice1 {

    public static void frequencies(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int counter = 1;
            while(i+1<arr.length && arr[i] == arr[i+1]){
                counter++;
                i++;
            }
            System.out.println(curr+" "+counter);
        }
    }

    public static int maxProfit(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public static int rainTrappingWater(int[] arr){
        int leftMax = 0;
        int waterCount = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[leftMax]){
                int max = arr[leftMax++];
                while(leftMax<i){
                    waterCount+=max-arr[leftMax++];
                }
                leftMax = i;
            }
            else{
                int currIndex = i;
                int max = arr[i];
                while(currIndex>leftMax){
                    waterCount+=max-arr[currIndex];
                    arr[currIndex--] = max;
                }
            }
        }
        return waterCount;
    }

    public static int rainWater(int[] arr){
        int[] lowHeight = new int[arr.length];
        int[] highHeight = new int[arr.length];
        lowHeight[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            lowHeight[i] = Math.max(lowHeight[i-1],arr[i]);
        }
        highHeight[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            highHeight[i] = Math.max(highHeight[i+1],arr[i]);
        }
        int result = 0;
        for(int i=1;i<arr.length-1;i++){
            result+=Math.min(lowHeight[i],highHeight[i])-arr[i];
        }
        return result;
    }

    public static int maxSumSubArr(int[] arr){
        int max = arr[0];
        int prevMax = arr[0];
        for(int i=1;i<arr.length;i++){
            prevMax = Math.max(arr[i],prevMax+arr[i]);
            max = Math.max(max,prevMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,-2,3,-1,2,-2};
        System.out.println(maxSumSubArr(arr));
        int[][] matrix = new int[3][4];
        int[][] matrix1 = matrix.clone();


        LinkedList<Integer> test = new LinkedList<>();
        test.add(10);
        test.add(20);
        System.out.println(test.remove());
    }
}
