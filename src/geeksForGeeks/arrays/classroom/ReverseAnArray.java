package geeksForGeeks.arrays.classroom;

public class ReverseAnArray {

    public static void reverseArray(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }
}
