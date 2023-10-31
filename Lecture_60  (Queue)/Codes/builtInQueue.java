import java.util.LinkedList;
import java.util.Queue;

public class builtInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q);
        // q.remove(2);
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // System.out.println(q.element());
        // System.out.println(q.poll());
        // System.out.println(q);
        int l = q.size();
        // Q: Print a queue without using built in mrthod.
        Queue<Integer> q1 = new LinkedList<>();
        while (q.size()!=0) {
            q1.add(q.remove());
        }
        // System.out.println(q);
        while(q1.size()!=0){
            System.out.print(q1.peek()+" ");
            q.add(q1.poll());
        }
        // System.out.println(q1);
    }
}
