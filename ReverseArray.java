package assignments;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
		int num[]=new int[3];
		num[0]=21;
		num[1]=42;
		num[2]=6;
		int reverse[]=new int[3];
		for(int i=0,k=reverse.length-1;i<num.length;i++,k--) {
			reverse[k]=num[i];
		}
		System.out.println(Arrays.toString(reverse));

	}

}
