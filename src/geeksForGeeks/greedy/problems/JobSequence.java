package geeksForGeeks.greedy.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequence {
    int[] JobScheduling(Job arr[], int n){
        int[] res = new int[2];
        if(n==0){
            return res;
        }
        Comparator<Job> compare = new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return 0;
            }
        };
        Arrays.sort(arr,(a,b)-> b.profit-a.profit);
        for(int i=0;i<n;i++){
            System.out.print(arr[i].id+" ");
            System.out.print(arr[i].deadline+" ");
            System.out.print(arr[i].profit+" ");
            System.out.println();
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int currIndex = arr[i].deadline-1<n?arr[i].deadline-1:n-1;
            while (result[currIndex]!=0 && currIndex>0){
                currIndex--;
            }
            if(result[currIndex]==0){
                result[currIndex] = arr[i].profit;
            }
        }
        for(int i=0;i<n;i++){
            if(result[i]!=0){
                res[1]+=result[i];
                res[0]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Job[] arr = {new Job(1,4,20),new Job(2,1,10),new Job(3,1,40),new Job(4,1,30)};
        JobSequence j = new JobSequence();
        int[] res = j.JobScheduling(arr,arr.length);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}

class Job{
    int id, profit, deadline;
    Job(int x,int y,int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
