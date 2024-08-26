package assignments;
public class MethodOverloading {
	void add()
	{
		System.out.println(1);
	}
	void add(int a)
	{
		System.out.println(2);
	}
	static void add(char a)
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
		System.out.println("Method Overloading");
		add('b');
		MethodOverloading m1 = new MethodOverloading();
		m1.add();
		m1.add(100);
			}
}
