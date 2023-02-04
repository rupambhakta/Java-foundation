public class problem_2 {
    static void sortFurts(String furts[]) {
        int n = furts.length;
        for (int i = 0; i < n - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < n; j++) {
                if (furts[j].compareTo(furts[minValue]) < 0) {
                    minValue = j;
                }
            }
            String temp = furts[i];
            furts[i] = furts[minValue];
            furts[minValue] = temp;
        }
    }

    public static void main(String[] args) {
        String fruits[] = { "kiwi", "apple", "papaya", "mango", "aaa" };
        sortFurts(fruits);
        for (String val : fruits) {
            System.out.println(val + " ");
        }
    }
}
