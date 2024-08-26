package assignments;
import java.util.Scanner;
public class Area_of_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the breadth b");
		int b=sc.nextInt();
		System.out.println("Enter the height h");
		int h=sc.nextInt();
		sc.close();
		int Area = (b*h)/2;
		System.out.println("Enter the area of triangle " +Area);
		
	}

}
