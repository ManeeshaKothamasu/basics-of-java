package assignments;
public class AverageOfArray {
public static void main(String[] args) {
	int rollno[]=new int[4];
	rollno[0]=100;
	rollno[1]=200;
	rollno[2]=300;
	rollno[3]=400;
	double sum=0;
	for(int i=0;i<rollno.length;i++) {
		sum=sum+rollno[i];
	}
     double average=sum/rollno.length;
     System.out.println(average);
	}

}
