package geekForGeeks.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree1 {

    static class Node {
        int val;
        List<Node> nodes;
        Node parent;

        Node(int val, Node parent){
            this.val = val;
            this.parent = parent;
            this.nodes= new ArrayList<>();
        }
    }

    public static Node lca(Node left, Node right) {
        if(left.parent == null || right.parent == null){
            return null;
        }

        while(left!=right) {
            left = left.parent;
            right = right.parent;
        }

        return left;
    }

    public static void main(String[] args) {
        Node parent = new Node(1,null);
        Node left = new Node(2, parent);
        Node right = new Node(3, parent);

        parent.nodes.add(left);
        parent.nodes.add(right);

        System.out.println(lca(left,right).val);

        Part p = new Part();
        p.print();

    }
}

class Vehicle {

    public void print() {
        System.out.println("Test");
    }
}

class Car extends Vehicle {
    public void print() {
        System.out.println("Car");
    }
}


class Part extends Car{
    public void print() {
        super.print();
    }
}