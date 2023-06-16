public class revomingNthNodeFromTheEnd {
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

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void delNthNodeFromEnd(Node head, int n) { // This method will not run in the case of last node
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
    }
    public static Node delNthNodeFromEnd2(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(17);
        Node f = new Node(90);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        print(a);
        // delNthNodeFromEnd(a, 1);
        a=delNthNodeFromEnd2(a, 6);
        print(a);

    }
}
