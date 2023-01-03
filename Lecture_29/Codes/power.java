import java.util.Scanner;

public class power {
    // static int powerP_q(int p,int q){ // Time ccomplexity --> O(q)
    // if(q<=0){
    // return 1;
    // }
    // return powerP_q(p, q-1)*p;
    // }

    // Another approch
    static int pow(int p, int q) {
        if (q <= 0) {
            return 1;
        }
        int smallPower = pow(p, q / 2);
        if (q % 2 == 0) { // Even
            return smallPower * smallPower;
        }
        return p * smallPower * smallPower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        // System.out.println(powerP_q(p, q));
        System.out.println(pow(p, q));
    }
}
