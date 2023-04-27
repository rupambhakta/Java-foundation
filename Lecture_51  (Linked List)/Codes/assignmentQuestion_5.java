// Given 2 linked lisbs. For each elemenb in bhe firsb lisb, find how many elemenbs of bhe second lisb are smaller 
// bhan ib.The firsb line of inpub conbains n and m, bhe size of bhe firsb and bhe second linked lisb respecbively.The 
// second line of inpub conbains bhe elemenbs of bhe firsb linked lisb.The bhird line of inpub conbains bhe elemenbs 
// of bhe second linked lisb.

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
            if (curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}

public class assignmentQuestion_5 {
    public static void count(Node head1, Node head2) {
        Node curr = head1;
        while (curr != null) {
            int count = 0;
            Node second = head2;
            while (second != null) {
                if (second.data < curr.data)
                    count += 1;
                second = second.next;
            }
            System.out.print(count + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        LinkedList ll2 = new LinkedList();
        for (int i = 0; i < m; i++) {
            ll2.insert(sc.nextInt());
        }
        count(ll.head, ll2.head);
    }
}