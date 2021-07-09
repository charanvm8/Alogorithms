package educative.topKElements;

import java.util.*;

public class TopK {

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        // TODO: Write your code here
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i: nums) {
            q.add(i);
            if (q.size() > k){
                q.poll();
            }
        }
        return new ArrayList<>(q);
    }

    public static int findKthSmallestNumber(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: nums) {
            q.add(i);
            if (q.size() > k){
                q.poll();
            }
        }
        int counter = 1;
        while (counter < k) {
            q.poll();
            counter++;
        }
        return q.poll();
    }


    public static List<Integer> findClosestElements(int[] arr, int K, Integer X) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            counter.put(num, Math.abs(X - num));
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((n1, n2) -> {
            return Math.abs(X - n1.getValue()) - (X - n2.getValue());
        });

        for(Map.Entry<Integer,Integer> entry : counter.entrySet()){
            q.add(entry);

            if (q.size() > K) {
                q.poll();
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!q.isEmpty()) {
            result.add(q.poll().getKey());
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        List<Integer> res = findClosestElements(arr, 3, 7);
        for (Integer i : res) {
            System.out.println(i+" ");
        }
//        System.out.println(findKthSmallestNumber(arr, 4));
//        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());

    }
}
