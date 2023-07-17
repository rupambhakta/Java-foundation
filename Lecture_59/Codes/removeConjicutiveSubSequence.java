import java.util.Stack;

public class removeConjicutiveSubSequence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int res[] = remove(arr);
        for (int i : res) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int res[] = new int[st.size()] ;
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}
