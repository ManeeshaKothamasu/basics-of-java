package assignments;
class Parent{
	void login(int a) {
		System.out.println("parent");
	}
}
public class Super_Keyword extends Parent {
	void login(int a) {
		System.out.println("child");
		super.login(200);
	}

	public static void main(String[] args) {
		Super_Keyword s1 = new Super_Keyword();
		s1.login(100);

	}

}
