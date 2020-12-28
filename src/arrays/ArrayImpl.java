package arrays;

import utility.PrintArray;

public class ArrayImpl {

    public static int insertInArr(int[] arr,int val,int size,int capacity,int pos){
        if(size==capacity){
            return val;
        }
        for(int i=size-1;i>=pos-1;i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = val;
        return size+1;
    }

    // Return index rewrite later
    public static int secondLargest(int[] arr,int size){
        if(size<1){
            return -1;
        }
        int first = Math.max(arr[0],arr[1]);
        int second = Math.min(arr[0],arr[1]);
        for(int i=2;i<size;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second){
                second = arr[i];
            }
        }
        return first==second?-1:second;
    }
    public static int removeDupsInSorted(int[] arr,int size){
        int nonDupIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[nonDupIndex]!=arr[i]){
                arr[++nonDupIndex] = arr[i];
            }
        }
        return nonDupIndex;
    }

    public static void moveZerosToEnd(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = 0;
                arr[index++] =temp;
            }
        }
    }

    public static void printFrequencies(int[] arr){
        if(arr.length==0){
            return;
        }
        int currEle = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==currEle){
                count++;
            }
            else{
                System.out.println(currEle+" "+count);
                currEle = arr[i];
                count = 1;
            }
        }
        System.out.println(currEle+" "+count);
    }


    public static int stockBuyAndSell(int[] arr,int len){
        int profit = 0;
        for(int i=1;i<len;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public static int trapWater(int[] arr,int len){
        if(len==0){
            return 0;
        }
        int waterTrapped = 0;
        for(int i=1;i<len;i++){
            int leftMax = 0;
            for(int j=1;j<i;j++){
                if(arr[j]>arr[leftMax]){
                    leftMax = j;
                }
            }
            int minHeight = Math.min(arr[i],arr[leftMax]);
            int water =0;
            for(int k=leftMax+1;k<i;k++){
                water+=minHeight-arr[k];
            }
            waterTrapped = Math.max(waterTrapped,water);
        }
        return waterTrapped;
    }

    public static int trapWater1(int[] arr,int len){
        if(len==0){
            return 0;
        }
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        maxLeft[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            maxLeft[i] = Math.max(maxLeft[i],maxLeft[i-1]);
        }
        maxRight[len-1] = arr[len-1];
        for(int i=len-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i],maxRight[i+1]);
        }
        int res = 0;
        for(int i=1;i<len-1;i++){
            res+= Math.min(maxLeft[i],maxRight[i])-arr[i];
        }
        return res<0?0:res;
    }





    public static void main(String[] args) {
//        int[] arr = {0,0,0,10};
//        int[] arr1 = {8,5,0,10,0,20};
//        int[] arr2 = {10,10,20,30,30,30};
        //System.out.println(removeDupsInSorted(arr,arr.length));
//        moveZerosToEnd(arr);
//        moveZerosToEnd(arr1);
//        PrintArray.printArray(arr);
//        PrintArray.printArray(arr1);
//        printFrequencies(arr2);
        int[] arr3 = {1,2,3};
        System.out.println(trapWater1(arr3,arr3.length));
    }
}
