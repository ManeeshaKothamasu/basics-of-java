package assignments;

public class FinalVariable {
	final static double pi = 3.14;
	
	void area_of_circle()
	{
		final int r=7;
		double a = pi*r*r;
		System.out.println(a);
	}

	public static void main(String[] args) {
		FinalVariable f1 = new FinalVariable();
		f1.area_of_circle();

	}

}
