package assignments;
class Axis {
	Axis(){
		System.out.println("Axis");
	}}
class Indian extends Axis{
	Indian(double b){
		System.out.println("Indian");
	}}
public class Super_Calling_Statement extends Indian {
	Super_Calling_Statement(){
		super(9.45);
		System.out.println("Super");
	}
	public static void main(String[] args) {
		new Super_Calling_Statement();

	}

}
