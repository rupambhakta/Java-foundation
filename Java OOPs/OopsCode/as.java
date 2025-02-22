public class as {
	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 == 0)
					break;
				sum += a[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}

}