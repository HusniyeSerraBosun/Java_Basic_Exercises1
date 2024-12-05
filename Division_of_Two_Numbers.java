package exercises;
import java.util.*;
public class Division_of_Two_Numbers {
	public static void main(String[] args) {
		
		//Write a Java program to divide two numbers and print them on the screen.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers");
		float a,b;//When you divide two integers,the remainder is thrown away.
		double division;
		a=scanner.nextInt();
		b=scanner.nextInt();
		division=a/b;

		System.out.println("Division is "+division);
	}
		
}
