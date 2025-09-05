public class Fibonacci {
	static void PrintFibonacci(int n) {
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

	public static void main(String args[]) {
		PrintFibonacci(10);
	}
}