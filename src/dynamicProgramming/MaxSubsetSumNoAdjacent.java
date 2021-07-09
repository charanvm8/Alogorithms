package dynamicProgramming;

public class MaxSubsetSumNoAdjacent {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        int second = array[0];
        int first = array[1];
        for(int i=2;i<array.length;i++){
            int max = Math.max(first,second+array[i]);
            second = Math.max(first,second);
            first=max;
        }
        return Math.max(first,second);
    }

    public static void main(String[] args) {
        int[] input = {4,3,5,200,5,3};
        System.out.println(maxSubsetSumNoAdjacent(input));
    }
}
