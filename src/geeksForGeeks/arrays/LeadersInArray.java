package geeksForGeeks.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        int len = arr.length;
        int lastLeader = arr[len-1];
        leaders.add(lastLeader);
        for(int i=len-2;i>=0;i--){
            if(arr[i]>lastLeader){
                leaders.add(arr[i]);
                lastLeader = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
