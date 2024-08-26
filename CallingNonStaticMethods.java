package assignments;

public class CallingNonStaticMethods {
	 void add()
	 {
		 System.out.println("Addition Method");
	 }
	 void sub()
	 {
		 System.out.println("Subtracyion Method");
	 }

	public static void main(String[] args) {
		System.out.println("Non-Static Methods");
		CallingNonStaticMethods c1 = new CallingNonStaticMethods();
		c1.add();
		c1.sub();

	}

}
