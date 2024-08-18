public class printPath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        PrintMaze(1, 1, rows, cols, "");
    }

    private static void PrintMaze(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // go down
        PrintMaze(sr + 1, sc, er, ec, s + "D");
        // go Right
        PrintMaze(sr , sc+1, er, ec, s + "R");

    }
}
