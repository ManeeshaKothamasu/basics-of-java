package assignments;

public class ContructorOverloading {
	ContructorOverloading()
	{
		System.out.println(100);
	}
	ContructorOverloading(boolean a)
	{
		System.out.println(200);
	}
	ContructorOverloading(String a){
		System.out.println(300);
	}
	public static void main(String[] args) {
		System.out.println("ConstructorOverloading");
		new ContructorOverloading();
		new ContructorOverloading(true);
		new ContructorOverloading("maneesha");
	}

}
