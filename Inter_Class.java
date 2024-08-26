package assignments;
interface Google{
	void add();
}
interface Flipcart{
	void sub();
}
public class Inter_Class implements Google, Flipcart {
	public void sub() {
		System.out.println("subtraction");
	}
	public void add() {
		System.out.println("Addition");
		
	}
	
public static void main(String[] args) {

  Inter_Class g1=new Inter_Class();
  g1.add();
  g1.sub();
  
}
}
