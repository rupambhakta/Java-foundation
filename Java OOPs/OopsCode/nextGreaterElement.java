import java.util.Stack;

public class nextGreaterElement {
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // The span of the first day is always 1.
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the current price is greater than the price at the top of the stack.
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, it means there are no higher prices before this day.
            // If the stack is not empty, it contains the index of the most recent day with a higher price.
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push the current day onto the stack.
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateStockSpan(prices);

        System.out.print("Stock Span Values: ");
        for (int value : span) {
            System.out.print(value + " ");
        }
    }
}
