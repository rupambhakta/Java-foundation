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