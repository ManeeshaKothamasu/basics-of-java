package assignments;

import java.util.Arrays;

public class CompareArrays {
public static void main(String[] args) {
		int rollno1[] = new int[3];
		rollno1[0]=12;
		rollno1[1]=24;
		rollno1[2]=36;
		int rollno2[]=new int[3];
		rollno2[0]=12;
		rollno2[1]=24;
		rollno2[2]=36;
		boolean answer = Arrays.equals(rollno1, rollno2);
		System.out.println(answer);

	}

}
