package assignments;
class Inheritance{
	void Even() {
		int num = 23;
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
		}}}

public class SingleInheritance extends Inheritance{
	void Class() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		SingleInheritance s1 = new SingleInheritance();
		s1.Class();
		s1.Even();
}
}
