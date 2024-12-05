package exercises;

import java.util.*;

public class Multiplication_Table {

	public static void main(String[] args) {
		//A Java program that takes a number as input and prints its multiplication table up to 10.
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a number: ");
		int input;
		input=scanner.nextInt();
		
		//to create the table
		for(int i=0;i<10;i++) {
			int result;
			result=input*(i+1);
			System.out.println(input+" x "+(i+1)+" = "+result);
		}
	}

}
