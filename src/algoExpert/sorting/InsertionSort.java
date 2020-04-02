package algoExpert.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int arrlen = arr.length;
        for(int i=1;i<arrlen;i++){
            int pres = arr[i];
            int counter = i-1;
            while(counter>-1 && pres<arr[counter]){
                arr[counter+1]=arr[counter];
                counter--;
            }
            arr[counter+1] = pres;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {5,2,3};
        System.out.println(insertionSort(arr));
    }
}
