package geeksForGeeks.searching.theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheoryMain {

    public static void main(String[] args) {
//        int[] arr = {2,5,8,12,16,23,38,56,72,91};
//        System.out.println(BinarySearch.binarySearchRec(arr,0,arr.length-1,91));
//        System.out.println(BinarySearch.binarySearchIterative(arr,0,arr.length-1,91));
//        System.out.println(TernarySearch.ternarySearchRec(arr,0,arr.length-1,5));
//        System.out.println(TernarySearch.ternarySearchIterative(arr,0,arr.length-1,20));
//        System.out.println(Arrays.binarySearch(arr,91));
//        List ints = new ArrayList();
//        ints.add(30);
//        ints.add(20);
//        ints.add(10);
//
//        System.out.println(Collections.binarySearch(ints,30,Collections.reverseOrder()));

//        int[] arr1 = {2,2,3,1,6,4};
//        MissingRepeatingNumber.missingNumberMath(arr1);
//
//        int[] arr3 = {1,1,2,2,2,2,2,3};
//        System.out.println(CountOccurances.countOccurrances(arr3,1));

//            int[] arr = {1,2};
//        System.out.println(arr[0]);
//        System.out.println(3>arr1[-1]);
//        int[] arr4 = {1,2,11, 21, 24, 29, 36, 49, 52, 52, 53, 55, 61, 66, 70, 72, 75, 75, 79, 83, 86, 92, 92, 93, 95, 96, 97};
//        System.out.println(CountOccurances.getFirstOccurance(arr4,0,arr4.length,2));
//        int[] arr5 = {10, 20};
//        PeakElements.peekElements(arr5,0,arr5.length-1);
        int[] arr5 = {0,0,0,4};
        MoveZerosToEnd.moveZerosToEnd(arr5);
        for(int z:arr5){
            System.out.print(z+" ");
        }

    }
}

