package geeksForGeeks.recursion;

import java.util.ArrayList;

public class PossiblePhoneDigits {

    static ArrayList<String> possibleWords(int a[], int N)
    {
        // your code here
        String[] arr = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        ArrayList<String> res = new ArrayList<String>();
        getPossibleWords(a,N,0,"",arr,res);
        return res;
    }

    static void getPossibleWords(int[] a,
                                 int N,
                                 int currNum,
                                 String currString,
                                 String[] arr,
                                 ArrayList<String> res){
        if(currNum>=N){
            res.add(currString);
            return;
        }
        int num = a[currNum];
        String nums = arr[num];
        for(int i=0;i<nums.length();i++){
            getPossibleWords(a,N,currNum+1,currString+nums.charAt(i),arr,res);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        ArrayList<String> res = possibleWords(arr,arr.length);
        System.out.println(res);
    }
}
