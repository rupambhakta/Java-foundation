import java.util.*;

public class ListInterfaceExamples {
    static void ArrayListExamples() {
        // ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("Skills");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
        System.out.println(st.pop());

    }
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    static void PriorityQueueExamples(){
        // PriorityQueue<Integer> pq = new PriorityQueue<>();//min pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//Max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
    static void DequeExamples(){

    }

    public static void main(String[] args) {
        // ArrayListExamples();
        // StackExamples();
        // QueueExamples();
        // PriorityQueueExamples();
        DequeExamples();
    }
}