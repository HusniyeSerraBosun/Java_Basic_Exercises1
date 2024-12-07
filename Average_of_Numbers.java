package exercises;
import java.util.*;
class Average_of_Numbers {
	//A Java program that takes numbers as input to calculate and print the average of the numbers.
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("How many numbers do you want to calculate the average of?  ");
		int input=scan.nextInt();
		
		double number;
		double total=0;
		for(int i=0;i<input;i++) {
			System.out.print("Enter "+(i+1)+" number: ");
			number=scan.nextDouble();
			total+=number;
		}
		double average=total/input;
		System.out.println("Average is "+average);
	}

}
