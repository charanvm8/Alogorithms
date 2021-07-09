package educative.topKElements;

import java.util.PriorityQueue;

public class TopKNumbers {

    public static void main(String[] args) {
        PriorityQueue<Integer> testing = new PriorityQueue<>();
        testing.add(1);
        testing.add(10);
        testing.add(5);
        System.out.println(testing.poll());
        System.out.println(testing.poll());

        int start = 0;
        for(;start<10;start++){
            System.out.println(start);
        }
    }
}
