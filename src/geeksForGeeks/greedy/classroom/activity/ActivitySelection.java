package geeksForGeeks.greedy.classroom.activity;

import geeksForGeeks.greedy.classroom.activity.Activity;
import geeksForGeeks.greedy.classroom.activity.ActivityCompare;

import java.util.Arrays;

public class ActivitySelection {

    public static int maxSelection(Activity[] arr){
        if(arr.length<1){
            return 0;
        }
        Arrays.sort(arr,new ActivityCompare());
        int res = 1;
        int end = arr[0].end;
        for(int i=1;i<arr.length;i++){
            int arrStart = arr[i].start;
            if(arrStart>=end){
                res++;
                end = arr[i].end;
            }
        }
        return res;
    }
}
