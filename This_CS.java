package assignments;

public class This_CS {
	This_CS(){
		System.out.println("no para");
	}
	This_CS(int a){
		this();
		System.out.println("Single para");
	}
	This_CS(int a, double b){
		this(100);
		System.out.println("multi para");
	}

	public static void main(String[] args) {
		new This_CS(100, 9.56);

	}

}
