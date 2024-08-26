package assignments;
class one{
	static void add() {
		System.out.println("Addition");
	}
}
class Two extends one{
	static void sub() {
		System.out.println("Subtraction");
	}
}
public class MultiInheritance extends Two{
	static void mul() {
		System.out.println("Multiplication");
	}
public static void main(String[] args) {
		add();
		sub();
		mul();

	}

}
