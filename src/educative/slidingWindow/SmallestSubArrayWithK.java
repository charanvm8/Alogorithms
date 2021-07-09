package educative.slidingWindow;

public class SmallestSubArrayWithK {

    public static int smallestSubArrayWithSizeK(int[] subArr,int size){
        int result = Integer.MAX_VALUE;
        int startSubArrIndex = 0;
        int currentTotal = 0;
        for(int endSubArrIndex = 0;endSubArrIndex<subArr.length;endSubArrIndex++){
            currentTotal+=subArr[endSubArrIndex];
            while (currentTotal>=size){
                result = Math.min(result,endSubArrIndex-startSubArrIndex+1);
                currentTotal-=subArr[startSubArrIndex++];
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }

    public static void main(String[] args) {
        int[] subArr = {2, 1, 5, 2, 3, 2};
        System.out.println(smallestSubArrayWithSizeK(subArr,7));

    }
}
