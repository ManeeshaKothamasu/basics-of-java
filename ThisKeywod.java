package assignments;

public class ThisKeywod {

	int age;
		double salary;
		
		void details(int age, double salary) {
			this.age = age;
			this.salary = salary;
		}
			public static void main(String[] args) {
				ThisKeywod t1 = new ThisKeywod();
				t1.details(18, 23000);
				System.out.println(t1.age);
				System.out.println(t1.salary);

	}

}
