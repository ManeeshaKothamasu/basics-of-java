package assignments;
import java.util.Arrays;
public class ExceptionHandling {
public static void main(String[] args) {
		int a1[]=new int[4];
		a1[0]=20;
		a1[1]=22;
		a1[2]=45;
		a1[3]=98;
		try{
		a1[4]=89;
		System.out.println(Arrays.toString(a1));
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Please check the index");
		}
	}

}
