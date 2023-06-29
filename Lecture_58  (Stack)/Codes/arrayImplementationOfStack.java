public class arrayImplementationOfStack {
    public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x) {
            if(idx==arr.length){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        Boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }

        Boolean isFull() {
            if (idx == arr.length-1) {
                return true;
            } else
                return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.peek();
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(2);
        st.push(2);
        st.push(2);
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

    }
}
