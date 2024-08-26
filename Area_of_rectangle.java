package assignments;
import java.util.Scanner;
public class Area_of_rectangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length l");
	double l = sc.nextDouble();
	System.out.println("Enter the breadth b");
	double b = sc.nextDouble();
	sc.close();
	double area = l*b;
	System.out.println("Area of rectangle " +area);


	}

}
