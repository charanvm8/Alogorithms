package dynamicProgramming.classroom;

public class MinJumps {

    public static int minJumps(int[] arr,int currPos){
        if(currPos==0){
            return 1;
        }
        int[] res = new int[arr.length];
//        for(int i=1;i<arr.length;i++){
//            int currVal = arr[i];
//            for(int j=i;j<i+currVal;j++){
//                if(res[j]==0){
//                    res[j]=res[i]+1;
//                }
//            }
//        }
        return res[arr.length-1];
    }

    public static int minJumpsRec(int[] arr,int start,int end){
        if (start>=end){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i=start;i<arr[start];i++){
            res = Math.min(res,1+minJumpsRec(arr,i+1,end));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,2,1};
        System.out.println(minJumpsRec(arr,0,arr.length-1));
    }
}
