package assignments;
abstract class Amazon{
	abstract void add();
	abstract void sub();
}
public class Abstract_Class extends Amazon {
    void add() {
	System.out.println("addition");
	}
	void sub() {
	System.out.println("subtraction");	
	}
	static void mul() {
		System.out.println("multiplication");
	}
	static void div() {
		System.out.println("division");
	}
    public static void main(String[] args) {
	mul();
	div();
	Abstract_Class c1=new Abstract_Class();
	c1.add();
	c1.sub();
}}
