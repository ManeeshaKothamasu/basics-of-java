package assignments;
public class StringCount {
public static void main(String[] args) {
		String name = "Bangalore city 1234";
		char [] a1 = name.toCharArray();
		int count_alpha=0; int count_numeric=0;int count_space=0;
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isAlphabetic(a1[i]);
			if(answer==true) {
				count_alpha++;
			}
		}
		System.out.println("No of alphabets in a string "+count_alpha);
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isDigit(a1[i]);
			if(answer==true) {
				count_numeric++;
			}
		}
		System.out.println("No of numbers in a string "+count_numeric);
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isSpaceChar(a1[i]);
			if(answer==true) {
				count_space++;
			}
		}
		System.out.println("No of spaces in a string "+count_space);
	}

}
