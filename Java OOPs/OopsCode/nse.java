import java.util.Stack;

public class nse {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 6, 3, 5 };
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        res[n-1] = n ;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                res[i] = n ;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
