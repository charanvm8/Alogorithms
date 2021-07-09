package geekForGeeks.tree;

import java.util.*;

public class Tree {

    static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.val);
    }

    public static int height (Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + height(root.left) + height(root.right);
    }

    public static void kFromRoot (Node root, int currLevel) {
        if (root == null) {
            return;
        }
        if (currLevel == 0) {
            System.out.println(root.val);
            return;
        }
        kFromRoot(root.left, currLevel - 1);
        kFromRoot(root.right, currLevel - 1);
    }

    public static void levelOrderTraversal (Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.println(curr.val);
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }

    public static void levelOrderTraversalByLine (Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.offer(null);
                continue;
            }
            System.out.print(curr.val + " ");
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }

    public static int sizeOfTree (Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }


    public static int maxInTree (Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftVal = maxInTree(root.left);
        int righVal = maxInTree(root.right);
        return Math.max(root.val, Math.max(leftVal, righVal));
    }

    int maxLevel = -1;
    public  void leftView (Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(root.val);
            maxLevel = level;
        }
        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }

    public void leftView (Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.println(curr.val);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static boolean childSum (Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if (root.left != null){
            sum += root.left.val;
        }
        if (root.right != null) {
            sum += root.right.val;
        }
        return sum == root.val && childSum(root.left) && childSum(root.right);
    }

    boolean isBalanced = true;
    public boolean isBalanced (Node root) {
        getHeight(root);
        return isBalanced;
    }

    public int getHeight (Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(rightHeight - leftHeight) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int checkForBalancedTree (Node root) {
        if (root == null){
            return 0;
        }
        int leftHeight = checkForBalancedTree(root.left);
        if (leftHeight == -1){
            return -1;
        }
        int rightHeight = checkForBalancedTree(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(rightHeight - leftHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

    static Node prev = null;
    public static Node convertToDLL (Node root, Node head) {
        if (root == null){
            return null;
        }
        Node left = convertToDLL(root.left, head);
        if (head == null && left != null) {
            head = left;
            prev = left;
        }
        root.left = prev;
        prev.right = left;
        prev = root;
        convertToDLL(root.right, head);
        return head;
    }

    public static int preIndex = 0;
    public static Node cTree(int[] inOrder, int[] preOrder, int inS, int inE) {
        if (inS > inE) {
            return null;
        }
        Node root = new Node(preOrder[preIndex++]);
        int index = 0;
        for (int i = inS; i <= inE; i++) {
            if(inOrder[i] == root.val) {
                index = i;
            }
        }

        root.left = cTree(inOrder, preOrder, inS, index - 1);
        root.right = cTree(inOrder, preOrder, index + 1, inE);

        return root;
    }


    public static Node lca(Node root, Node left, Node right) {
        if (root == null) {
            return null;
        }

        if (root.val == left.val || root.val == right.val) {
            return root;
        }

        Node leftT = lca(root.left, left,right);
        Node rightT = lca(root.right, left, right);

        if (leftT != null && rightT != null) {
            return root;
        }

        if (leftT != null) {
            return leftT;
        }
        return rightT;
    }




    public static int burnTree(Node root, Node leaf) {
        return 0;
    }


    public void serialize(Node root, ArrayList<Integer> result) {
        if (root == null) {
            result.add(-1);
            return;
        }
        result.add(root.val);
        serialize(root.left, result);
        serialize(root.right, result);

    }

    int index = 0;
    public Node deserialize(ArrayList<Integer> val) {
        if (index == val.size()) {
            return null;
        }
        int currVal = val.get(index);
        index++;
        if (currVal == -1){
            return null;
        }
        Node root = new Node(currVal);

        root.left = deserialize(val);
        root.right = deserialize(val);

        return root;
    }


    public static void main(String[] args) {
        int[] arr = { 2, 8, 30, 15, 25, 12};

        int[] res = new int[arr.length];

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.higher(arr[i]) == null) {
                res[i] = -1;
            }
            else{
                res[i] = set.ceiling(arr[i]);
            }
            set.add(arr[i]);
        }

        for (int i : res){
            System.out.println(i + " ");
        }

    }
}
