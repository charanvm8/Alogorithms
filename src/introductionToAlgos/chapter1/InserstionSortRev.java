package introductionToAlgos.chapter1;

public class InserstionSortRev {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int prev = i-1;
            while(prev>-1 && arr[prev]<key){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1] = key;
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
