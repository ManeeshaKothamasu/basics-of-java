package assignments;

public class CallingStaticMethods {
	
	static void add()
	{
		System.out.println("Addition Method");
	}
	
	static void sub()
	{
		System.out.println("Subtraction Method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		add();
		sub();
	}

}
