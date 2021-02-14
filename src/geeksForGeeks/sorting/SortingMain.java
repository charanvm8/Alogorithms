package geeksForGeeks.sorting;

import geeksForGeeks.sorting.classroom.IntersectionOfArrays;
import geeksForGeeks.sorting.classroom.NaivePartition;
import geeksForGeeks.sorting.classroom.SortArrayTwoWays;
import geeksForGeeks.sorting.classroom.UnionOfArrays;
import geeksForGeeks.sorting.theory.*;
import utility.PrintArray;

import java.util.HashMap;
import java.util.Map;

public class SortingMain {

    //Lomuto Partition
    public static int naivePartition(int[] arr){
        int pos = 0;
        int last = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<last){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos++] = temp;
            }
        }
        int temp = arr[pos];
        arr[pos] = last;
        arr[arr.length-1] = temp;
        return pos;
    }

    // Hoares partition
    public static void hoaresPartition(int[] arr){

//        pivot  = low;
//        high = high;

    }



    public static void sortTwoTypes(int[] arr){
        if(arr.length==0){
            return;
        }
        int positiveIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                positiveIndex++;
                int temp = arr[positiveIndex];
                arr[positiveIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void sortThreeTypes(int[] arr){
        if(arr.length==0){
            return;
        }
        int leftIndex  = -1;
        int rightIndex = arr.length;
        for(int i=0;i<arr.length;i++){

        }
    }

//    public static void mergeOverlapping(int[] arr){
//        //sort the array
//        int start = 0;
//        int end = 0;
//        for(int i=1;i<arr.length;i++){
//            //if arr[i] <end
//            end = arr[i];
//            else{
//                list .add(stat);
//
//            }
//        }
//    }

    public static void main(String[] args) {
        //int arr[] = {50,10,1};
        //InsertionSort.insertionSort(arr);
        //BubbleSort.bubbleSort(arr);
//        MergeSort.mergeSort(arr,0,arr.length-1);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        int[] a = {1,1,3,3,3};
//        int[] b = {1,1,1,1,3,5,7};
//        IntersectionOfArrays.intersectionOfArrays(a,b);

//        int[] a = {2,3,3,3,4};
//        int[] b = {4,4};
//        UnionOfArrays.unionOfArrays(a,b);

//        int[] arr = {30,40,20,50,80};
//        NaivePartition.naivePartition(arr,arr.length-1);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        int[] arr = {15,-3,-2,16};
//        SortArrayTwoWays.sortArrayTwoWays(arr);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println(-3%2);
//        Map<Integer,Integer> s
//                = new HashMap<>();

        int[] arr1 = {3,8,6,12,10,7,1};
        System.out.println(naivePartition(arr1));
        PrintArray.printArray(arr1);

    }

}
