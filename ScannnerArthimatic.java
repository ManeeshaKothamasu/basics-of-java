package assignments;
import java.util.Scanner;
public class ScannnerArthimatic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value a");
	int a = sc.nextInt();
	System.out.println("Enter the value b");
	int b = sc.nextInt();
	int sum = a+b;
	int sub = a-b;
	int mul = a*b;
	int div = a/b;
	int mod = a%b;
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mul);
	System.out.println(div);
	System.out.println(mod);
}
}
