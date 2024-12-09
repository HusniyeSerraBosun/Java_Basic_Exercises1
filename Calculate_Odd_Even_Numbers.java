package exercises;
import java.util.*;
public class Calculate_Odd_Even_Numbers {

	public static void main(String[] args) {
		//A Java Program to Find the Sum of First N Odd & Even Numbers.
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int input=scanner.nextInt();
		int sumOfEven=0;
		int sumOfOdd=0;

		int i;
		for(i=2;i<=input;i+=2) {
			sumOfEven+=i;	
			System.out.println(i);
		}
		System.out.println("Sum of even number is "+sumOfEven);
		
		int j;
		for(j=1;j<=input;j+=2) {
				sumOfOdd+=j;
				System.out.println(j);
		}
		System.out.println("Sum of odd number is "+sumOfOdd);
	}

 }
