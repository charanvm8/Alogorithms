package geeksForGeeks.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrImp {


    // reverse an array
    // time complexity = O(n)
    // space complexity = O(1)
    public void reverseArr(int[] arr){
        int arrLen = arr.length;
        for(int i=0;i<arrLen/2;i++){
            int temp = arr[i];
            arr[i] = arr[arrLen-i-1];
            arr[arrLen-i-1] = temp;
        }
    }

    // remove duplicates
    // time complexity = O(n)
    // Space complexity = O(1)
    public void removeDuplicates(int[] arr){
        if(arr.length<2){
            return;
        }
        int uniqueIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[uniqueIndex]!=arr[i]){
                arr[++uniqueIndex] = arr[i];
            }
        }
        for(int i=uniqueIndex+1;i<arr.length;i++){
            arr[i] = 0;
        }
    }

    // Right rotate an Array by 1
    public void rotateArrayByOne(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    // Left rotate an Array by 1
    public void leftRotateByOne(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length] = temp;
    }

    // Left rotate an Array by N
    public void leftRotateByN(int[] arr,int n){

    }

    // Leaders in Array Problem
    // Time Complexity O(n^2)
    // Space Complexity O(n)
    public int[] leadersInArray(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                leaders.add(arr[i]);
            }
        }
        return leaders.stream().mapToInt(i->i).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,50};
        List<String> strs = new ArrayList<String>();
        ArrImp arrImp = new ArrImp();
        arrImp.reverseArr(arr);
        //arrImp.removeDuplicates(arr);
        int[] testArr = arrImp.leadersInArray(arr);
        for(int i:testArr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
