package geeksForGeeks.greedy;

import geeksForGeeks.greedy.classroom.activity.Activity;
import geeksForGeeks.greedy.classroom.activity.ActivitySelection;
import geeksForGeeks.greedy.classroom.knapsack.FractionalKnapSack;
import geeksForGeeks.greedy.classroom.knapsack.KnapSack;

public class GreedyMain {

    public static void main(String[] args) {
//        Activity[] arr = {new Activity(12,25),new Activity(10,20),new Activity(20,30)};
//        System.out.println(ActivitySelection.maxSelection(arr));

        KnapSack[] arr = {new KnapSack(50,600),new KnapSack(20,500),new KnapSack(30,400)};
        System.out.println(FractionalKnapSack.maxValue(arr,70));
    }
}
