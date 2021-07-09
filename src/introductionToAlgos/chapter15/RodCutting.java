package introductionToAlgos.chapter15;

public class RodCutting {

//    public static int maxRodValue(int[] arr,int rodLength){
//        if(rodLength==0 || rodLength>arr.length){
//            return 0;
//        }
//        int max = Integer.MIN_VALUE;
//        for(int i=1;i<=rodLength;i++){
//            max = Math.max(max,arr[rodLength-i]+maxRodValue(arr,i-1));
//        }
//        return max;
//    }

    public static int memMaxRodValue(int[] arr,int rodLength){
        int[] memValues = new int[arr.length];
        return getMaxValue(arr,rodLength,memValues);
    }

    public static int getMaxValue(int[] arr,int rodLength,int[] storedValues){
        if(rodLength==0){
            return 0;
        }
        if(storedValues[rodLength-1]!=0){
            return storedValues[rodLength-1];
        }
        else{
            int maxValue = Integer.MIN_VALUE;
            for(int i=1;i<=rodLength;i++){
                maxValue = Math.max(maxValue,arr[rodLength-i]+getMaxValue(arr,i-1,storedValues));
            }
            storedValues[rodLength-1] = maxValue;
            return maxValue;
        }
    }

    public static void main(String[] args) {
        int[] prices = {1,5,8,9,10,17,17,20,24,30};
        System.out.println(memMaxRodValue(prices,10));
    }
}
