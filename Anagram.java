package assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name="race";
		String name1="care";
		if(name.length()==name1.length()) {
			char [] c1=name.toCharArray();
			char [] c2=name1.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(c1);
			System.out.println(c2);
			boolean answer=Arrays.equals(c1, c2);
			if(answer==true) {
				System.out.println("Given string is an anagram");
			}
			else {
				System.out.println("Given string is not an anagram");
			}
		}
		else {
			
			System.out.println("Given string is not an anagram length is different");
		}

	}

}
