package geeksForGeeks.greedy.classroom.activity;

import geeksForGeeks.greedy.classroom.activity.Activity;

import java.util.Comparator;

public class ActivityCompare implements Comparator<Activity> {
    @Override
    public int compare(Activity o1, Activity o2) {
        return o1.end - o2.end;
    }
}