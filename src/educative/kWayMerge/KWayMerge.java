package educative.kWayMerge;

import java.util.*;

public class KWayMerge {




    public static ListNode merge(ListNode[] lists) {
        PriorityQueue<ListNode> nodes = new PriorityQueue<>(Comparator.comparing((ListNode o) -> o.value));
        for (int i = 0; i < lists.length; i++) {
            nodes.add(lists[i]);
        }
        ListNode start = null; ListNode end = null;
        while (!nodes.isEmpty()) {
            ListNode curr = nodes.poll();
            if (start == null) {
                start = curr;
                end = curr;
            }
            else {
                end.next = curr;
                end = curr;
            }
            if (curr.next != null) {
                nodes.add(curr.next);
            }
        }
        return start;
    }

    public static int findKthSmallest(List<Integer[]> lists, int k) {
        // TODO: Write your code here
        PriorityQueue<Node> nodes = new PriorityQueue<>(Comparator.comparing((Node n)->lists.get(n.index)[n.value]));
        for (int i = 0; i < lists.size(); i++) {
            nodes.add(new Node(i,0));
        }
        int counter = 0; int res = -1;
        while (counter < k) {
            Node curr = nodes.poll();
            counter++;
            res = lists.get(curr.index)[curr.value];
            if (counter == k){
                break;
            }
            if (curr.value < lists.get(curr.index).length) {
                curr.value++;
                nodes.add(curr);
            }
        }
        return res;
    }

    public static int findKthSmallest(int[][] matrix, int k) {
        // TODO: Write your code here
        PriorityQueue<MatrixNode> nodes = new PriorityQueue<>(
                Comparator.comparing((MatrixNode n)-> matrix[n.row][n.column]));

        for (int i = 0; i < matrix.length; i++){
            nodes.add(new MatrixNode(i,0));
        }

        int counter = 0; int res = -1;

        while (counter < k) {
            MatrixNode currNode = nodes.poll();
            res = matrix[currNode.row][currNode.column];

            if (++counter == k) {
                break;
            }

            currNode.column++;

            if (currNode.column < matrix[currNode.row].length) {
                nodes.add(currNode);
            }
        }
        return res;
    }

    public static int[] findSmallestRange(List<Integer[]> lists) {
        // TODO: Write your code here
        return new int[] { -1, -1 };
    }


    public static List<int[]> findKLargestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();

        return result;
    }


    public static void main(String[] args) {

    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

class Node {
    int index;
    int value;
    Node (int index, int value) {
        this.index = index;
        this.value = value;
    }
}

class MatrixNode {
    int row;
    int column;
    MatrixNode (int row, int column) {
        this.row = row;
        this.column = column;
    }
}
