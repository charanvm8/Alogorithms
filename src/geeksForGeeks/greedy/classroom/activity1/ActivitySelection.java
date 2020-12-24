package geeksForGeeks.greedy.classroom.activity1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    static int maxActivity(Activity[] activities){
        if(activities.length==0){
            return 0;
        }
        Comparator<Activity> compare1 = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return 0;
            }
        };
        Comparator<Activity> compare = new ActivityCompare();
        Collections.sort(Arrays.asList(activities),compare);
        Activity curr = activities[0];
        int maxActivities = 1;
        for(int i=1;i<activities.length;i++){
            if(curr.end<=activities[i].start){
                maxActivities++;
                curr = activities[i];
            }
        }
        return maxActivities;
    }

    public static void main(String[] args) {
        Activity[] arr = {new Activity(12,25),
                            new Activity(10,20),
                            new Activity(20,30)};
        System.out.println(maxActivity(arr));
    }
}
