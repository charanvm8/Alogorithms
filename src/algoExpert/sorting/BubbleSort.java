package algoExpert.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int arrLen = array.length;
        boolean sorted;
        for(int i=0;i<arrLen-1;i++){
            sorted = false;
            for(int j=0;j<arrLen-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3};
        System.out.println(bubbleSort(arr));
    }
}
