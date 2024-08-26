package assignments;
public class GivenNumber {
public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=100;
		rollno[1]=200;
		rollno[2]=300;
		rollno[3]=400;
		int given_number=100;
		for(int i=0;i<rollno.length;i++) {
			if(given_number==rollno[i]) {
				System.out.println("Given number is part of array");
			}
			else {
				System.out.println("Sorry Not Found");
			}
		}

	}

}
