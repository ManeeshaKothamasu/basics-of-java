package assignments;
class Parent1{
	void add() { System.out.println("add");}
	void sub() {System.out.println("sub");}
	static void mul() {System.out.println("mul");}
	static void div() {System.out.println("div");}
}
public class Upcating extends Parent1 {
	void chrome() { System.out.println("chrome");}
	void edge() {System.out.println("edge");}
	static void moz() {System.out.println("moz");}
	static void saf() {System.out.println("saf");}
public static void main(String[] args) {
	Parent1 p1=new Upcating();
	p1.add();
	p1.sub();
	mul();
	div();
	Upcating u1=(Upcating) p1;
	u1.chrome();
	u1.edge();
	moz();
	saf();

	}

}
