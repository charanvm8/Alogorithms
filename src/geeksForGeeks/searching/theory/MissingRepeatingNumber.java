package geeksForGeeks.searching.theory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingRepeatingNumber {

    //Solution 1

    //Solution 2 - Using Math equations
    public static void missingNumberMath(int[] arr){
        // get sum of numbers until length
        int arrLen = arr.length;
        int sumUntilLength = (arrLen*(arrLen+1))/2;
        int sumOfArr = 0;
        for(int i=0;i<arrLen;i++){
            sumOfArr+=arr[i];
        }
        int multiplyTillLen = 1;
        for(int i=2;i<=arrLen;i++){
            multiplyTillLen*=i;
        }
        int multiplyNums = 1;
        for(int i=0;i<arrLen;i++){
            multiplyNums*=arr[i];
        }

        int diff = multiplyNums*(sumUntilLength-sumOfArr);
        int divide = multiplyTillLen-multiplyNums;

        System.out.println("Missing Number : "+diff/divide);
        System.out.println("Repeated Number : "+(diff/divide+(sumUntilLength-sumOfArr)));

    }

    // Solution 3 - Using Hashing
    public static void missingNumberHashing(int[] arr){
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int i=1;i<=arr.length;i++){
            numberMap.put(i,0);
        }
        for(int i=0;i<arr.length;i++){
            if(numberMap.keySet().contains(arr[i])){
                numberMap.put(arr[i],numberMap.get(arr[i])+1);
            }
        }
        for(Integer key:numberMap.keySet()){
            if(numberMap.get(key)==0 || numberMap.get(key)==2){
                System.out.print(key+ " ");
            }
        }
    }

    // Negative indexing

}
