import java.util.Scanner;

class queue {
    private static int arr[] = new int[5];
    private static int MAX = arr.length;
    private static int front = -1;
    private static int rear = -1;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out
                    .println("\nTo insert press 1: \nTo delete press 2 : \nTo display press 3: \nEnter 4 for exit!\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insert();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void insert() {
        if (rear == MAX - 1) {
            System.out.println("Queue overflow!");
            return;
        } else {
            if (rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            System.out.println("Enter a value to insert : ");
            arr[rear] = in.nextInt();
        }

    }

    private static void del() {
        if (front == -1) {
            System.out.println("Underflow !!");
        } else {
            System.out.println("Deleted element is " + arr[front] + "\n");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    }

    private static void display() {
        if (front == -1) {
            System.out.println("Underflow !!");
        } else {
            System.out.print("Values in queue : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}