package exercises;
import java.util.*;
public class Circle_Area_and_Perimeter {
	// A Java program to print the area and perimeter of a circle.
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		
		double radius=scanner.nextDouble();
		
		System.out.println("Perimeter is "+(2*radius*Math.PI));
		System.out.println("Area is "+(Math.PI*radius*radius));

	}

}
