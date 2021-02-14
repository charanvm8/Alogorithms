package geeksForGeeks.arrays;

import java.util.*;

public class ArraysMain {

    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array Construction
        //int[] arr = {10,20,80,40,50};
//        List<String> ss = new ArrayList<>();

        //System.out.println(CheckIfArrayIsSorted.isArraySorted(arr));

//        int[] arr1 = {30,20,5};
//        ReverseArray.reverseArr(arr1);
//        printArr(arr1);

//        int[] arr2 = {10,20,20,20,20,30,30,30,30,30,40};
//        System.out.println(RemoveDuplicates.removeDuplicates(arr2));

//        int[] arr3 = {10,20,20,20,20,30,30,30,30,30,40};
//        LeftRotateByN.leftRotateByN1(arr3,2);
//        printArr(arr3);

//        int[] arr4 = {7,10,4,3,6,5,2};
//        ArrayList<Integer> leaders = LeadersInArray.leadersInArray(arr4);
//        for(Integer i:leaders){
//            System.out.println(i);
//        }
//        int[] arr6 = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
//        System.out.println(Monotonic.isMonotonic(arr6));

//        int[] arr7 = {2,3,10,6,4,8,1};
//        int[] arr8 = {7,9,5,6,3,2};
//        int[] arr9 = {10,20,30};
//        int[] arr10 = {30,10,8,2};
//        System.out.println(MaximumDiff.maxDiff(arr7));

//        int[] arr11 = {1,5,3,8,12};
//        System.out.println(BuySellStock1.buySellStock2(arr11,0,arr11.length-1));

        String s = "asrea";

        Set<String> ss = new HashSet<>();
        ss.add("harsha");
        ss.add("charan");
        List<String> lst = Arrays.asList("charan","vardhan","dileep");
        ss.removeAll(lst);
        System.out.println(ss);
     }
}
