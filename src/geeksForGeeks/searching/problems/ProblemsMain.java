package geeksForGeeks.searching.problems;

import geeksForGeeks.recursion.SubsetsSumCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemsMain {

    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = {60 ,10 ,20 ,30 ,40 ,50};
//        System.out.println(MinimumNumber.minNumber(arr,0,arr.length-1));
//        int[] arr1 = { -10,0,5 };
//        System.out.println(MissingNumber.missingNumber(arr1,arr1.length));

//        int[] arr = {-47,1,4,49,-18,10,26,18,-11,-38,-24,36,44,-11,45,20,-16,28,17,-49,47,-48,-33,42,2,6,-49,30,36,-9,15,39,-6,-31,-10,-21,-19,-33,47,21,31,25,-41,-23,17,6,47,3,36,15,-44,33,-31,-26,-22,21,-18,-21,-47,-31,20,18,-42,-35,-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0,43,-50,-16,14,-26};
//        System.out.println(MissingNumber.missingNumberSort(arr,arr.length));
        //printArr(arr);

//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(SubArray.subarraySum(arr1.length,15,arr1));
//        int arr[] = {4,5};
//        int brr[] = {2,3};
//        System.out.println(MedianOfSortedArrays.findMedian(arr,arr.length,brr,brr.length));

//        int height[] = {16,11,16,62,2,97,61,1,66,32,58,48,17,5,93,3,83,91,84,14,5,52,58,26,37,36,81,55,55,40,65,24,97,98,75,88,97,29,45,36,77,40,26,13,84,90,89,91,43,41,51,66,86,63,96,92,8,60,77,99,60,90,59,48,30,49};
//        System.out.println(MaximumWater.maxWater(height,height.length));

        int arr[] = {2,3,4,5,5};
        System.out.println(CountRepeated.findRepeating(arr,arr.length));
    }
}
