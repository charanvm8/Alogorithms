package introductionToAlgos.chapter6;

public class HeapSort {

    public static void heapify(int[] arr,int index,int heapSize){
        int leftChild = 2*1;
        int rightChild = (2*1)+1;
        int largest = Integer.MIN_VALUE;
        if(leftChild<heapSize && arr[index]<arr[leftChild]){
            largest = leftChild;
        }
        else{
            largest = index;
        }
        if(rightChild<heapSize && arr[largest]<arr[rightChild]){
            largest = rightChild;
        }

        if(largest!=index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr,largest,heapSize);
        }
    }



    public static void main(String[] args) {

    }
}
