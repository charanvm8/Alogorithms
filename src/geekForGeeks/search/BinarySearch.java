package geekForGeeks.search;

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int[] arr,int number){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==number){
                return mid;
            }
            if(arr[mid]>number){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr,int number,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==number){
            return mid;
        }
        if(arr[mid]>number){
            return binarySearchRec(arr,number,start,mid-1);
        }
        else{
            return binarySearchRec(arr,number,mid+1,end);
        }
    }

    public static int binarySearchFirstOcc(int[] arr,int number){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>number){
                end = mid-1;
            }
            else if(arr[mid]<number){
                start = mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static int binarySearchLastOcc(int[] arr,int number){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>number){
                end = mid-1;
            }
            else if(arr[mid]<number){
                start = mid+1;
            }
            else{
                if(mid==end || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    public static int searchInRotatedArr(int[] arr,int number){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==number){
                return mid;
            }
            else if(arr[mid]>arr[start] && number>=arr[start] && number<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100,200,10,30,40};
        System.out.println(searchInRotatedArr(arr,40));
        List<Integer> testing = new ArrayList<>();
        testing.add(10);
        Queue<Integer> testingQ = new LinkedList<>();
        System.out.println();
        System.out.println(testingQ);
        Stack<Character> test  = new Stack<>();
        //System.out.println(test.pop());
        boolean[] arr2 = new boolean[10];
        System.out.println(arr2[0]);
        Stack<Integer> queue= new Stack();
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
