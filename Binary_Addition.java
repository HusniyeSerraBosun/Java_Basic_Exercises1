package exercises;
import java.util.*;
public class Binary_Addition {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter first binary number: ");
		long a=scanner.nextLong();

		System.out.print("Enter second binary number: ");
		long b=scanner.nextLong();
		
		String sum=addBinary(a,b);
		System.out.println("The sum is "+sum);
		
	}
	public static String addBinary(long a,long b) {
		StringBuilder sum=new StringBuilder();
		
		int remainder;
		remainder=0;
		
		while ( a>0 || b>0 || remainder>0) {
			int digit1= (int) (a%10);
			int digit2= (int) (b%10);
			
			int curSum=digit1 + digit2 + remainder;
			sum.append(curSum%2);
			remainder=curSum/2;
			
			a/=10;
			b/=10;
			
		}
		return sum.reverse().toString();
	}
}
