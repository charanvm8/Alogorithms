package dynamicProgramming.classroom;

public class MinJumps {

    public static int minJumps(int[] arr,int currPos){
        if(currPos==0){
            return 1;
        }
        int res = Integer.MAX_VALUE;
        for(int i=currPos-1;i>=0;i--){
            if(arr[i]>=currPos-i){
                int res1 = Math.min(res,minJumps(arr,i));
                if(res!=Integer.MAX_VALUE){
                    res = Math.min(res,res1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,2,1};
        System.out.println(minJumps(arr,arr.length-1));
    }
}
