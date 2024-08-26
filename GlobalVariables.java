package assignments;

public class GlobalVariables {
	static int a=30;
	int b=20;
	void sub()
	{
		GlobalVariables g1 = new GlobalVariables();
		System.out.println(a-g1.b);
	}
	public static void main(String[] args) {
		GlobalVariables g1 = new GlobalVariables();
		System.out.println(a+g1.b);
		g1.sub();

	}

}
