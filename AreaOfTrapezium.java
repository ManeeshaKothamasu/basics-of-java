package assignments;
import java.util.Scanner;
public class AreaOfTrapezium {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side a");
		int a=sc.nextInt();
		System.out.println("Enter the side b");
		int b=sc.nextInt();
		System.out.println("Enter the height h");
		int h=sc.nextInt();
		sc.close();
		int area = (h/2)*(a+b);
		System.out.println("Area of trapezium " +area);

	}

}
