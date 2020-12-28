package dynamicProgramming.classroom;

public class OptimalStrategy {

    public static int getOptimal(int[] arr,int sum,int start,int end){
        return 0;
    }

    public static int getTotal(int[] arr){
        int i = 0;
        for(int z:arr){
            i+=z;
        }
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {20,5,4,6};
        System.out.println(getOptimal(arr,getTotal(arr),0,arr.length));
    }
}
