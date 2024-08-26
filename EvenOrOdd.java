package assignments;
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value a");
	String a = sc.next();
	sc.close();
	String f = "f";
	if(a.equals(f))
	{
		System.out.println("Even number "+a);
	}
	else
	{
		System.out.println("Odd number "+a);
	}

	}

}
