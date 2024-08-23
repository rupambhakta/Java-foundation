public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        Print(0, 0, rows - 1, cols - 1, "", isVisited);
    }

    private static void Print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0)
            return;
        if (sr > er || sc > ec)
            return;
        if (isVisited[sr][sc] == true) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go down
        Print(sr + 1, sc, er, ec, s + "D", isVisited);
        // go Right
        Print(sr, sc + 1, er, ec, s + "R", isVisited);
        // go Left,
        Print(sr, sc - 1, er, ec, s + "L", isVisited);
        // go Up
        Print(sr - 1, sc, er, ec, s + "U", isVisited);
        // Backtracking
        isVisited[sr][sc] = false;
    }
}
// 38:35 min