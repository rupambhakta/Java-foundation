public class problem_7 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) { // representing columns
            for (int j = 0; j < size; j++) {// representing rows
                if (i == size / 2) { // middle column
                    System.out.print("*");
                } else {
                    if (j == size / 2) { // middle row
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
