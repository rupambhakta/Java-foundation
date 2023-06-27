import java.util.*;

public class insertionInStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void PushAtButtom(Stack<Integer> st,int data){
        if(st.size()<1){
            st.push(data);
            return;
        }
        int top = st.pop();
        PushAtButtom(st, data);
        st.push(top);
    }

    public static void reverStackRec(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        reverStackRec(st);
        PushAtButtom(st, top);
    }
    public static void removeFromButtom(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        displayRec(st);
        // PushAtButtom(st, 0);
        // reverStackRec(st);
        removeFromButtom(st);
        System.out.println();
        displayRec(st);


        //System.out.println(st);
        // displayReverseRec(st);
        // System.out.println();
        // displayRec(st);

        // System.out.println("Enter the possition where you want to insert: ");
        // int n = sc.nextInt();
        // Stack<Integer> rt = new Stack<>();
        // while (st.size() > n) {
        //     rt.push(st.pop());
        // }
        // System.out.println("Enter the element: ");
        // int e = sc.nextInt();
        // st.push(e);
        // while (rt.size() > 0) {
        //     st.push(rt.pop());
        // }
        // System.out.println(st);
    }
}
