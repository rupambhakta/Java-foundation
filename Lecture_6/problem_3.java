import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost prise: ");
        int cost_prise=sc.nextInt();
        System.out.println("Enter selling price: ");
        int selling_price=sc.nextInt();
        if(selling_price>cost_prise){
            int profit=selling_price-cost_prise;
            System.out.println("Your profit is "+profit);
        }
        else{
            int loss=cost_prise-selling_price;
            System.out.println("Your loss is "+loss);
        }
    }
}
