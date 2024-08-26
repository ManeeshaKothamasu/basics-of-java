package assignments;
import java.util.Scanner;
public class IfConditionForGender {
	public static void main(String[] args) {
     char gender1 = 'F'; char gender2 = 'M'; int age;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter age");
     age = sc.nextInt();
     sc.close();
     if(gender1=='M') {
    	 System.out.println("Travelling fee is free");
     }
     else if(gender2 == 'M'){
    	 if(age<=10) {
    		 System.out.println("Travelling fee is half for less than age 10");
    	 }
    	 else if(age>=12&&age<=59) {
    		 System.out.println("Travelling fee is full");
    	 }
    	 else {
    		 System.out.println("Travelling fee is half for more than 60");
    	 }
     }
     else {
    	 System.out.println("Enter correct gender input");
     }
}
}
