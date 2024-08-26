package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
public static void main(String[] args) {
	int a[]= new int[3];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values");
	try{
	for(int i=0;i<=a.length;i++) {
		a[i] = sc.nextInt();
	}
	}
	catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println("Enter the values based on the index");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc1.nextInt();
		}
	}
		catch(InputMismatchException a2) {
			System.out.println("Enter the valid input");
			Scanner sc1=new Scanner(System.in);
			for(int i=0;i<a.length;i++) {
				a[i]=sc1.nextInt();
		}
		}
		
	}		

	}


