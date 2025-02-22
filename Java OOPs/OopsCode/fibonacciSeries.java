public class fibonacciSeries {
    public static void main(String[] args) {
        int i,x=0,y=1,z,n=10;
        System.out.println("Fibonacci series");
        System.out.println(x);
        System.out.println(y);
        for(i=2;i<n;i++){
            z= x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
    }
}
