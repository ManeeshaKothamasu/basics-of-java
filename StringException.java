package assignments;
public class StringException {
public static void main(String[] args) {
	String s1="Manish";
	try {
	System.out.println(s1.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e1) {
		System.out.println("Please check the index of string");
	}

	}

}
