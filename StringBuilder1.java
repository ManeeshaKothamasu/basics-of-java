package assignments;
public class StringBuilder1 {
public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("manish");
		System.out.println("capacity - " +s1.capacity());
		s1.append(" Kumar Tiwari");
		System.out.println("Append - " +s1);
		s1.insert(19, " is a mentor");
		System.out.println("Insert - " +s1);
		s1.replace(0, 6, "Abhishek");
		System.out.println("replace manish to abhishek - " +s1);
		s1.delete(9, 15);
		System.out.println("delete kumar - " +s1);
		s1.reverse();
		System.out.println("reverse a string - " +s1);
		System.out.println("length of a string " +s1.length());
		System.out.println("Specified character " +s1.charAt(12));
		System.out.println("Substring " +s1.substring(12));
		System.out.println("Specified substring " +s1.substring(0, 6));
		
		
		

	}

}
