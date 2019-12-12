package introductionToAlgos.chapter1;

public class InserstionSort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = i;
            while(temp-1>-1 && arr[temp]<arr[temp-1]){
                int newTemp = arr[temp];
                arr[temp] = arr[temp-1];
                arr[temp-1]=newTemp;
                temp--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
