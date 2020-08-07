package geeksForGeeks.searching.problems;

import geeksForGeeks.searching.theory.CountOccurances;

public class CountRepeated {
    public static int findRepeating(int arr[],int n)
    {
        //Your code here
        //You can return point as new Point(x,y)
        int repNum = findRep(arr,0,n-1);
        int firstOcc = CountOccurances.getFirstOccurance(arr,0,arr.length-1,repNum);
        int lastOcc = CountOccurances.getEndOccurance(arr,0,arr.length-1,repNum,arr.length);
        System.out.println(firstOcc+" "+lastOcc);
        return repNum;


    }

    public static int findRep(int[] arr, int start, int end){
        while(start<end){
            if(arr[start]==arr[end]){
                return arr[start];
            }
            int mid = start+((end-start)/2);
            if(arr[mid]-arr[start]!=mid-start){
                return findRep(arr,start,mid);
            }
            else{
                return findRep(arr,mid,end);
            }
        }
        return -1;
    }



}
