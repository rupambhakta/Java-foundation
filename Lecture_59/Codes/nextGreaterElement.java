import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-2;i>=0;i--) {
            while (st.peek()<arr[i] && st.size()>0) {
                st.pop();
            }
            if (st.size()==0) {
                res[i]=-1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
        for (int i=0;i<n;i++) {
            System.out.print(res[i]);
        }
    }
}

