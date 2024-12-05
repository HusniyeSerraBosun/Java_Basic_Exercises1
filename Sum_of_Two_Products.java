package exercises;
import java.util.*;
public class Sum_of_Two_Products {
	public static void main(String[] args) {
		//Write a Java program to print the sum of two numbers.
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		int a,b,sum;
		a=scanner.nextInt();
		b=scanner.nextInt();
		sum=a+b;
		
		System.out.println("Sum is "+sum);
	}
}
