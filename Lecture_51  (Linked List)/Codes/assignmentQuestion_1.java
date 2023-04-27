import java.util.*;
 
class Node {
    public char data;
    public Node next;
 
    public Node(char data) {
        this.data = data;
        next = null;
    }
}
 
class LinkedList {
    public Node head = null, tail = null;
 
    public void insert(char val) {
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
 
public class assignmentQuestion_1 {
    public static Node deleteNodesWithValueX(Node head) {
        while (head != null && head.data == 'x') {
            Node temp = head;
            head = head.next;
        }
        Node prev = null, curr = head;
        while (curr != null) {
            if (curr.data == 'x') {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = prev.next;
        }
        return head;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            String c = sc.next();
            ll.insert(c.charAt(0));
        }
        ll.head = deleteNodesWithValueX(ll.head);
        ll.print();
    }
}