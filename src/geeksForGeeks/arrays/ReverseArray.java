package geeksForGeeks.arrays;

public class ReverseArray {

    public static void reverseArr(int[] arr,int start,int end){

        int len = arr.length-1;
        int index = 0;

        while(index<len){
            int temp = arr[index];
            arr[index++]=arr[len];
            arr[len--] = temp;
        }
    }
}
