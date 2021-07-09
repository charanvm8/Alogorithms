package educative.slidingWindow;

public class MaxSubArrayOfK {

    public static int maxSubArraySumOfK(int[] subArr,int size){
        int length = subArr.length;
        int result = 0;
        int startCountIndex = 0;
        int currentCount = 0;
        for(int endCountIndex = 0;endCountIndex<length;endCountIndex++){
            currentCount+=subArr[endCountIndex];
            if(endCountIndex>=size-1){
                result = Math.max(currentCount,result);
                currentCount-=subArr[startCountIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] subArr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSubArraySumOfK(subArr,3));
    }
}
