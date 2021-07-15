package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    class Node{
        int test;
        Node next;

        Node(int val){
            this.test=val;
        }
    }

    public Node insertInSortedLL(Node head,int value){
        Node node = new Node(value);
        if(head == null){
            return node;
        }
        if(value<head.test){
            node.next = head;
            return node;
        }
        Node curr = head;
        while(curr.next!=null && curr.test<value){
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        return head;
    }

    public Node deleteLast(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node prev = head;
        Node curr = head.next;

        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return head;
    }

    public Node insertAt(Node head,int value,int position){
        Node newNode = new Node(value);
        if(head==null){
            return newNode;
        }
        if(position==1){
            newNode.next = head;
            return newNode;
        }
        Node prev = head;
        int counter = 1;
        while(counter<position && prev!=null){
            prev = prev.next;
            counter++;
        }
        if(prev==null){
            return head;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

    class Node2{
        int test;
        Node2 prev;
        Node2 next;
        Node2(int val){
            this.test = val;
        }
    }

    public Node2 insertAtBeginning(Node2 head,int value){
        Node2 node = new Node2(value);
        if(head == null){
            return head;
        }
        head.prev = node;
        node.next = head;
        return node;
    }

    public Node2 insertAtEnd(Node2 head,int value){
        Node2 node = new Node2(value);
        if(head==null){
            return node;
        }
        Node2 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        return head;
    }

    public Node2 reverseDLL(Node2 head){
        if(head==null || head.next==null){
            return head;
        }
        Node2 prev = null;
        Node2 curr = head;
        while(curr!=null){
            prev = curr;
            prev.prev = curr;
            prev = curr;
            curr=curr.next;
        }
        prev.next = prev.prev;
        prev.prev = curr;
        curr=curr.next;
        curr.prev = null;
        return curr;
    }

    public static void main(String[] args) {
        ArrayDeque<String> s = new ArrayDeque<>();
        s.push("Test");
        s.push("Test1");
        System.out.println();

        List<Integer> arr = new ArrayList<>();
        Collections.sort(arr);
        Collections.sort(arr, Collections.reverseOrder());

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedListRev = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

}
