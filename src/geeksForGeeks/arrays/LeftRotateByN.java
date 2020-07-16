package geeksForGeeks.arrays;

public class LeftRotateByN {

    // Method 1
    public static void leftRotateByN1(int[] arr,int k){
        int len = arr.length;
        if(k>len-1){
            k = k%(len-1);
        }
        for(int i=0;i<k;i++){
            LeftRotateByOne.leftRotateByOne(arr);
        }
    }

    // Method 2


    // Method 3
    public static void leftRotateByN3(int[] arr,int k){

    }
}
