public class sumOfDigitsUsingRecurtion {
    static int sumOfDigits(int n){

        // Base case
        if(n>=0 && n<=9){
            return n;
        }

        //Recurtive work
        int smallAns=sumOfDigits(n/10);

        // Self work
        int ans=smallAns+(n%10);

        return ans;

        // return sunOfDigits(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
}
