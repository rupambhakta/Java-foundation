public class arrayImplementationOfQueue {
    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;

        int arr[] = new int[100];

        // Add a element into queue
        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[r]=val;
            } else {
                arr[++r] = val;
            }
            size++;
        }

        // Remove the first element
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }

        // Return the first element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        // Display all the elemet present in the queue.
        public void display() {
            if (size == 0) {
                System.out.println("Nothing to display!!");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(8);
        q.display();
        q.remove();
        q.display();
    }
}
//1:00:00 