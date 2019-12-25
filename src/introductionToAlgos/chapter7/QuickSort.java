package introductionToAlgos.chapter7;

public class QuickSort {

//    public static void quickSort(int[] arr,int start,int end){
//        if (end<start){
//            return;
//        }
//        int pivot = sort(arr,start,end);
//        quickSort(arr,start,pivot-1);
//        quickSort(arr,pivot+1,end);
//    }
//
//    public static int sort(int[] arr,int start,int end){
//        int pivot = end;
//        int index = start;
//        for(int i=start+1;i<=end;i++){
//            if(arr[i]<arr[pivot]){
//                int temp = arr[index];
//                arr[index] = arr[i];
//                arr[i] = temp;
//                index++;
//            }
//        }
//        int temp = arr[pivot];
//        arr[pivot] = arr[index];
//        arr[index] = temp;
//        return index;
//    }

    public static void quickSort(int[] arr,int start,int end){
        if(end<=start){
            return;
        }
        int pivot = sort(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    public static int sort(int[] arr,int start,int end){
        int pivot = end;
        int pos = start-1;
        for(int i=start;i<=end;i++){
            if(arr[i]<arr[pivot]){
                pos++;
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot]=arr[pos+1];
        arr[pos+1]=temp;
        return pos+1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
