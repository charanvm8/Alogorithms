package dynamicProgramming.classroom;

public class LongestSubSeq {

    public static int lsq(int[] arr,int currIndex){
        if(currIndex<1){
            return 0;
        }
        int res = 0;
        if (arr[currIndex-1]<arr[currIndex]){
            res = 1+lsq(arr,currIndex-1);
        }
        else{
            res = lsq(arr,currIndex-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,8,10};
        System.out.println(lsq(arr,arr.length-1));
    }
}
