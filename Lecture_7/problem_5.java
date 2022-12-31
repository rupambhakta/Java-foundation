public class problem_5 {
    public static void main(String[] args) {
        int size = 5; // length of pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) { // consider a rectangle, we need to print stars where both diagonals
                                                   // are present

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
