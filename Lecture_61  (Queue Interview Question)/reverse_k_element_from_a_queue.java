import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_k_element_from_a_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(5);
        q.add(4);
        q.add(9);
        System.out.println(q);

        int k = 4;
        Stack<Integer> st = new Stack<>();
        while (k != 0) {
            st.push(q.remove());
            k--;
        }
        while (st.size() != 0) {
            q.add(st.pop());
        }
        System.out.println(q);
        for (int i = 0; i <= q.size() - k+1; i++) {
            // q.add(q.remove());
            int x = q.remove();
            q.add(x);
        }
        System.out.println(q);
    }
}
