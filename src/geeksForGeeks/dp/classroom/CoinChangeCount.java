package geeksForGeeks.dp.classroom;

public class CoinChangeCount {

    public static int coinChangeCount(int[] arr,int currItem,int target){
        if(target==0){
            return 1;
        }
        if(currItem<0){
            return 0;
        }
        int res = coinChangeCount(arr,currItem-1,target);
        if(arr[currItem]<=target){
            res+= coinChangeCount(arr,currItem,target-arr[currItem]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(coinChangeCount(arr,arr.length-1,4));
    }
}
