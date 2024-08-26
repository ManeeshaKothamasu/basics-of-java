package assignments;
public class CountSpecialChar {
public static void main(String[] args) {
		String name = "KV_no_12 bangalore"; int count_alpha=0;int count_numeric=0;int count_space=0;
		char [] c1=name.toCharArray();
		int total_count=name.length(); 
		for(int i=0;i<name.length();i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1==true) {
				count_alpha++;
			}
		}
		for(int i=0;i<name.length();i++) {
			boolean b1 = Character.isDigit(c1[i]);
			if(b1==true) {
				count_numeric++;
			}
		}
		for(int i=0;i<name.length();i++) {
			boolean b1 = Character.isSpaceChar(c1[i]);
			if(b1==true) {
				count_space++;
			}
		}
		int underscore=(total_count)-(count_alpha+count_numeric+count_space);
		System.out.println("No of under scores in a string "+underscore);

	}

}
