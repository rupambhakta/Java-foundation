import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
        int n = arr.length;
        int res[] = new int[n];
        res[n - 1] = -1;
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while ( st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
