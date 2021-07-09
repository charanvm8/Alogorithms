package educative.slidingWindow;

public class SubArrayAverage {

    public static double[] subArrayAveragesOfSize(int[] subArr,int size){
        int subArrSize = subArr.length;
        double result[] = new double[subArrSize-size+1];
        int currentTotal = 0;
        int subSizeArrStart = 0;
        for(int subSizeArrEnd = 0;subSizeArrEnd<subArrSize;subSizeArrEnd++){
            currentTotal+= subArr[subSizeArrEnd];
            if(subSizeArrEnd>=size-1){
                result[subSizeArrStart] = (double)currentTotal/size;
                currentTotal-=subArr[subSizeArrStart++];
            }
        }
        return result;
    }





    public static void main(String[] args) {
        int[] subArr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        double[] result = subArrayAveragesOfSize(subArr,5);
        for(double value : result){
            System.out.println(value+" ");
        }
    }
}
