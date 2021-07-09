package educative.topKElements;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestNumberInStream {

    PriorityQueue<Integer> q = new PriorityQueue<>();
    int k;

    public KthLargestNumberInStream(int[] nums, int k) {
        // TODO: Write your code here
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int num) {
        q.add(num);
        if (q.size() > k){
            q.poll();
        }
        return q.peek();
    }
}
