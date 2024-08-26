package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TwoExceptionsHandling {
public static void main(String[] args) {
		int a1[]=new int[4];
		System.out.println("Enter the values into array");
		Scanner sc=new Scanner(System.in);
		try {
		for(int i=0;i<=a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		}
		catch(InputMismatchException e1) {
			System.out.println("Enter the valid input");
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Please check the index");
		}
sc.close();
	}

}
