public class problem_6 {
    public static void main(String[] args) {
        int size = 5; // length of pattern is 5 only, the below part is the upside down version of top
                      // part with 5th line in the middle, with total of (2n-1) lines

        int alpha = 65; // ASCII code for first capital letter
        int num = 0; // will increment alpha as char progresses
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" "); // top half until the spaces need to be printed
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char) (alpha + num++));// top half until the char need to
                                                         // be printed, next char can be achieved by incrementing the
                                                         // ASCII code by 1
            }
            num = 0;
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) { // bottom half
                System.out.print(" ");
            }
            for (int k = (size - i) * 2 - 1; k > 0; k--) {
                System.out.print((char) (alpha + num++));
            }
            num = 0;
            System.out.println();
        }
    }
}
