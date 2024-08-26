package assignments;
import java.util.Scanner;
public class CircumferenceOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length l");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth b");
		double b = sc.nextDouble();
		sc.close();
		double circum = 2*(l+b);
		System.out.println("Circumference of rectangle " +circum);
}
}
