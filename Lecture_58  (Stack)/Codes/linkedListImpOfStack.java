public class linkedListImpOfStack {
    public static class Node { // User difine data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack { // User define data structure
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head=temp;
            size++;
        }

        void displayrec(Node h) {
            if (h == null) {
                return;
            }
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        void dispalyRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { // getter
            System.out.print("Size is: ");
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            System.out.print("Peek is: ");
            return head.val;
        }

        Boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(7);
        st.push(4);
        st.push(9);
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        
        System.out.println(st.size());
        st.display();

        System.out.println(st.isEmpty());
    }
}
