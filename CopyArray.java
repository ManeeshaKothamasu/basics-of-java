package assignments;

import java.util.Arrays;

public class CopyArray {
public static void main(String[] args) {
		String Enames[]=new String[3];
		Enames[0]="manish";
		Enames[1]="avinash";
		Enames[2]="ashok";
		String Snames[]=new String[3];
		for(int i=0;i<Enames.length;i++) {
			Snames[i]=Enames[i];
		}
		System.out.println(Arrays.toString(Snames));

	}

}
