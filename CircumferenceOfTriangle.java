package assignments;
import java.util.Scanner;
public class CircumferenceOfTriangle {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side a");
		int a=sc.nextInt();
		System.out.println("Enter the side b");
		int b=sc.nextInt();
		System.out.println("Enter the side c");
		int c=sc.nextInt();
		sc.close();
		int circum = a+b+c;
		System.out.println("Circumference of triangle " +circum);

	}

}
