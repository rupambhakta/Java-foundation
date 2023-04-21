import java.util.*;

public class linkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }// 1:21

    public static void displayRec(Node head) { // Display recursivly
        if (head == null)
            return;
        System.out.print(head.data + " ");
        displayRec(head.next);
        System.out.println();
    }

    public static void dispaly(Node head) { // Display itreatively
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int count(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // ................................................................
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        int getData(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void insertAny(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == count()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtBeg(val);
                return;
            } else if (idx < 0 || idx > count()) {
                System.out.println("Wrong Index!");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                deleteAtBeg();
                return;
            }
            if (idx == size) {
                deleteAtEnd();
                return;
            }
            if (idx < 0 || idx > count()) {
                System.out.println("Wrong Input!");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            // tail=temp;
            size--;
        }

        void deleteAtBeg() {
            /*
             * Node temp=head;
             * temp=temp.next;
             * head=temp;
             */
            head = head.next;
            size--;
        }

        void deleteAtEnd() {
            Node temp = head;
            for (int i = 1; i <= count() - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }

        void dispaly() { // Display itreatively
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int count() {
            // int count = 0;
            // Node temp = head;
            // while (temp != null) {
            // count++;
            // temp = temp.next;
            // }
            // return count;
            return size;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);// 1
        ll.insertAtEnd(2);// 1->2
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.dispaly();

        // ll.deleteAtBeg();
        // ll.deleteAtEnd();
        ll.deleteAt(1);
        ll.dispaly();
        System.out.println(ll.tail.data);
    }
}