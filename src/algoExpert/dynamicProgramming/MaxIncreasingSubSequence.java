package algoExpert.dynamicProgramming;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxIncreasingSubSequence {

    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        int[] arrResults = new int[array.length];
        int[] trackIndex = new int[array.length];
        Arrays.fill(trackIndex,Integer.MIN_VALUE);
        int maxSumIndex = 0;
        for(int i=0;i<array.length;i++){
            int indexValue = array[i];
            int tempIndex = i;
            int prevValue = 0;
            while(tempIndex>=0){
                if(array[tempIndex]<array[i]){
                    prevValue = arrResults[tempIndex];
                    trackIndex[i] = tempIndex;
                    break;
                }
                tempIndex--;
            }
            arrResults[i] = indexValue+prevValue;
            if(arrResults[i]>arrResults[maxSumIndex]){
                maxSumIndex = i;
            }
        }
        List<List<Integer>> resultsArr = new ArrayList<>();
        resultsArr.add(new ArrayList<>());
        resultsArr.add(new ArrayList<>());
        resultsArr.get(0).add(arrResults[maxSumIndex]);
        List<Integer> resultArr = getResultArr(array,trackIndex,maxSumIndex);
        resultsArr.get(1).addAll(resultArr);
        return resultsArr;
    }

    public static List<Integer> getResultArr(int[] array,int[] trackIndex,int maxSumIndex){
        List<Integer> arrResult = new ArrayList<>();
        while (maxSumIndex!=Integer.MIN_VALUE){
            arrResult.add(0,array[maxSumIndex]);
            maxSumIndex = trackIndex[maxSumIndex];
        }
        for(Integer i:arrResult){
            System.out.print(i+" ");
        }
        System.out.println();
        return arrResult;
    }


    public static void main(String[] args) {

        int[] test = {-1,1};

        maxSumIncreasingSubsequence(test);
    }
}
