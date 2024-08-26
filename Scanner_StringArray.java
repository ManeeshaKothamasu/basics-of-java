package assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Scanner_StringArray {
public static void main(String[] args) {
	double num[]=new double[4];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<num.length;i++) {
		num[i] = sc.nextDouble();
	}
		System.out.println(Arrays.toString(num));
		sc.close();
	}

}
