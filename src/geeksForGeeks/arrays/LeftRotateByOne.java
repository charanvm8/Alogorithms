package geeksForGeeks.arrays;

public class LeftRotateByOne {

    public static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        int len = arr.length-1;
        for(int i=1;i<=len;i++){
            arr[i-1]=arr[i];
        }
        arr[len]=temp;
    }
}
