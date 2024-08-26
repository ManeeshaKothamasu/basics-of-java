package assignments;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="mada";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			char a1=name.charAt(i);
			reverse = reverse+a1;
		}
		if(name.equals(reverse)) {
			System.out.println("Given string is a palindrome " +reverse);
		}
		else {
			System.out.println("Given string is not a palindrome " +reverse);
		}

	}

}
