package geekForGeeks.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinCoins {

    public static int minCoins(int[] coins,int target){
        if(target <= 0){
            return 0;
        }
        int minCoins = 0;
        for(int i=0;i<coins.length;i++){
            int maxCoins = target / coins[i];
            minCoins+=maxCoins;
            target -= coins[i] * maxCoins;
            if(target==0){
                break;
            }
        }
        return minCoins;
    }

    class Point{
        int start;
        int end;
        Point(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public static List<Point> activitySelection(List<Point> points){
        Collections.sort(points,(a,b)->a.end-b.end);
        List<Point> result = new ArrayList<>();
        Point previous = points.get(0);
        result.add(previous);
        for(int i=1;i<points.size();i++){
            Point curr = points.get(i);
            if(curr.start>=previous.end){
                result.add(curr);
                previous = curr;
            }
        }
        return result;
    }

    class Weight implements Comparable<Weight>{
        int weight;
        int value;
        Weight(int weight,int value){
            this.weight = weight;
            this.value = value;
        }

        public int getValue(){
            return value/weight;
        }

        public int compareTo(Weight first){
            return 0;
        }
    }

    public static int knapsack(List<Weight> weightValues,int capacity){
        Collections.sort(weightValues,(a,b)->b.getValue()-a.getValue());
        return 0;
    }

    class Job{
        int deadline;
        int profit;

        Job(int deadline,int profit){
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static int jobSequenceProfit(List<Job> jobs){
        Collections.sort(jobs,(a,b)->{
            if(a.deadline==b.deadline){
                return b.profit-a.profit;
            }
            return a.deadline-b.deadline;
        });
        int maxProfit = 0;
        int prev = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline!=prev){
                maxProfit+=curr.profit;
                prev = curr.deadline;
            }
        }
        return maxProfit;
    }

    public static boolean ratInMaze(int[][] matrix){
        if(matrix[0][0] == 0){
            return false;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] coins = { 10, 5, 2, 1};
        System.out.println(minCoins(coins, 57));
    }
}
