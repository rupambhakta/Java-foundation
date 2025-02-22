import java.util.*;
class Demo {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n = sc.nextInt();
		 int res = 1;
		 for(int i=1;i<=n;i++){
		       res = res*i;
		 }
		 System.out.print(res);
	}
}
