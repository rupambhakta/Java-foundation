//Q1:  Find m-th summation of first n natural numbers where m-th summation of first n natural 
//     numbers is defined as following:
//     If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//     Else :SUM(n, 1) = Sum of first n natural numbers.
class problem_2 {

    // Function to return mth summation
    static int SUM(int n, int m) {

        // base case
        if (m == 1)
            return (n * (n + 1) / 2);

        int sum = SUM(n, m - 1);

        return (sum * (sum + 1) / 2);
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 2;

        System.out.println("SUM(" + n + ", " + m + "): " + SUM(n, m));
    }
}
