package dynamicProgramming.classroom;

public class LongestSubSeq {

//    public static int lsq(int[] arr,int currIndex){
//        if(currIndex<1){
//            return 0;
//        }
//        int res = 0;
//        if (arr[currIndex-1]<arr[currIndex]){
//            res = 1+lsq(arr,currIndex-1);
//        }
//        else{
//            res = lsq(arr,currIndex-1);
//        }
//        return res;
//    }

    public static int lsq(int[] arr,int currIndex,int prev){
        if(currIndex==0){
            return 0;
        }
        int longest = 0;
        if(arr[currIndex-1]<prev){
            longest = 1+lsq(arr,currIndex-1,arr[currIndex-1]);
        }
        else{
            longest = lsq(arr,currIndex-1,prev);
        }
        int second = lsq(arr,currIndex-1,arr[currIndex-1]);
        return Math.max(longest,second);
    }

    public static int lsq1(int[] arr,int len){
        if(len == 0){
            return 0;
        }
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            int highVal = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    highVal = Math.max(highVal,res[j]);
                }
            }
            res[i] = 1+highVal;
        }
        return res[len-1];
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,8,10};
        //System.out.println(lsq(arr,arr.length,Integer.MAX_VALUE));
        System.out.println(lsq1(arr,arr.length));
    }
}
