package algoExpert.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            int temp = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[temp]){
                    temp = j;
                }
            }
            if(temp!=i){
                int val = array[i];
                array[i] = array[temp];
                array[temp] = val;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3};
        System.out.println(selectionSort(arr));
    }
}
