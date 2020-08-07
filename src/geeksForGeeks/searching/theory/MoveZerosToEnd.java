package geeksForGeeks.searching.theory;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int[] arr){
        int zeroIndex = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && i>zeroIndex){
                arr[zeroIndex++] = arr[i];
                arr[i]=0;

            }
            else if(arr[i]==0 && i<zeroIndex){
                zeroIndex = i;
            }
            //Math.max
        }
    }
}
