package geeksForGeeks.hashing.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortA1ByA2 {

    public static void sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        Arrays.sort(A1);
        Map<Integer, Integer> vals = new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(!vals.containsKey(A1[i])){
                vals.put(A1[i],i);
            }
        }
        System.out.println(vals);
        int arrCounter = 0;
        for(int i=0;i<M;i++){

        }
        for(int i:A1){
            System.out.println(i);
        }
    }
}
