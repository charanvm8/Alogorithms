package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestNumbers {

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        // TODO: Write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> res = new ArrayList<>();
        for(int num:nums)
        {
            queue.add(num);
        }
        for(int i=0;i<k;i++){
            res.add(queue.poll());
        }
        return res;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>(Collections.reverseOrder());
        test.add(1);
        test.add(3);
        test.add(2);
        List<Integer> arr = new ArrayList<>(test);
        for(Integer i:arr){
            System.out.println(i);
        }
        String s = "Charan";
        System.out.println(s.substring(1));
        System.out.println((int)'a');
    }
}
