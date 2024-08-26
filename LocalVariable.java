package assignments;

public class LocalVariable {
	
	void add()
	{
		int a = 12;
		int b= 10;
		b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		int a;
		a=10;
		System.out.println(a);
		LocalVariable l1 = new LocalVariable();
		l1.add();

	}

}
