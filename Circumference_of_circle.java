package assignments;
import java.util.Scanner;
public class Circumference_of_circle {
	static double pi = Math.PI;
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius r");
		int r=sc.nextInt();
		sc.close();
		double circum = 2*pi*r;
		System.out.println("Circumference of a cicle " +circum);

	}

}
