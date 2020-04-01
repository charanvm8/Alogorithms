package algoExpert.dynamicProgramming;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] array){
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }

        int first = array[0];
        int second = array[1];

        for (int i=2;i<array.length;i++) {
            int max = Math.max(second,first+array[i]);
            first = Math.max(first,second);
            second = max;
        }

        return Math.max(first,second);
    }

}
