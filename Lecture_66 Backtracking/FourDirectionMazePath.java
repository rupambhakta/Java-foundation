public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        Print(1, 1, rows, cols, "");
    }

    private static void Print(int sr, int sc, int er, int ec, String s) {
        if (sr < 1 || sc < 1)
            return;
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // go down
        Print(sr + 1, sc, er, ec, s + "D");
        // go Right
        Print(sr, sc + 1, er, ec, s + "R");
        // go Left
        Print(sr, sc - 1, er, ec, s + "L");
        // go Up
        Print(sr - 1, sc, er, ec, s + "U");

    }
}
// 38:35 min