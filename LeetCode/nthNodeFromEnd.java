public class nthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode2(Node head, int x) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= x; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node nthNodFromEnd(Node head, int n) {
        Node temp = head;
        int size = 0;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i <= m; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(113);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(17);
        Node f = new Node(90);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(nthNode2(a, 2).data);
        System.out.println(nthNodFromEnd(a, 2).data);
    }
}
