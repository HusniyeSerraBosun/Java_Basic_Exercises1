package exercises;
import java.util.*;
public class Swap_Variables {

	public static void main(String[] args) {
		//A Java program to swap two variables.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=scan.nextInt();
		System.out.print("Enter second number: ");
		int b=scan.nextInt();
		
		System.out.println("Before swapping : a = "+a+", b = "+b);
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping : a = "+a+", b = "+b);
	}

}
