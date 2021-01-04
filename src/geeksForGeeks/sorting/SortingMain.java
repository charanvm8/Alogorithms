package geeksForGeeks.sorting;

import geeksForGeeks.sorting.classroom.IntersectionOfArrays;
import geeksForGeeks.sorting.classroom.NaivePartition;
import geeksForGeeks.sorting.classroom.SortArrayTwoWays;
import geeksForGeeks.sorting.classroom.UnionOfArrays;
import geeksForGeeks.sorting.theory.*;

import java.util.HashMap;
import java.util.Map;

public class SortingMain {

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
        int[] arr = {15,-3,-2,16};
        SortArrayTwoWays.sortArrayTwoWays(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(-3%2);
        Map<Integer,Integer> s
                = new HashMap<>();



    }

}
