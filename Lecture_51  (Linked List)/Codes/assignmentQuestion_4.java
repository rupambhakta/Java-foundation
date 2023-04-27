// Given the head of a linked list which stores only binary values i.e. 1’s and 0’s. In the linked list make sure 
// that between every 2 nodes containing value 1, there exist an even number of 0’s. If the number of 0’s is odd 
// then insert a node with value 0 in between the two 1’s. Assume that the first and the last node contains value 

// The first line of input contains the size of the linked list.The second line of input contains the elements of the 
// linked list.

import java.util.*;
 
class Node {
    public int data;
    public Node next;
 
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
 
class LinkedList {
    public Node head = null, tail = null;
 
    public void insert(int val) {
        if (head == null) {
            head = tail = new Node(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }
 
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}
 
public class assignmentQuestion_4 {
    public static Node update(Node head) {
        int count = 0;
        Node prev = null, curr = head;
        while (curr != null) {
            if (curr.data == 1) {
                if (count % 2 == 1) {
                    prev.next = new Node(0);
                    prev = prev.next;
                    prev.next = curr;
                }
                count = 0;
            } else {
                count++;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        ll.head = update(ll.head);
        ll.print();
    }
}