package geeksForGeeks.sorting.classroom;

public class SortArrayTwoWays {

    public static void sortArrayTwoWays(int[] arr){
        int leftPos = -1;
        int rightPos = arr.length;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                leftPos++;
                int temp = arr[leftPos];
                arr[leftPos] = arr[i];
                arr[i] = temp;
            }
            else{
                rightPos--;
                int temp = arr[rightPos];
                arr[rightPos] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
