package assignments;

import java.util.Arrays;

public class BooleanArray {
public static void main(String[] args) {
	int array1[] = new int[3];
	array1[0]=12;
	array1[1]=24;
	array1[2]=36;
	double sum =0;
	for(int i=0;i<array1.length;i++) {
		sum=sum+array1[i];
	}
	double average=sum/array1.length;
	System.out.println(average);
	
	}
	

}
