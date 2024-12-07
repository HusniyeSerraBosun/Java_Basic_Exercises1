package exercises;
import java.util.*;
public class Rectangle_Area_and_Perimeter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius of width: ");
		double width=scanner.nextDouble();
		
		System.out.print("Enter the radius of height: ");
		double height=scanner.nextDouble();

		System.out.println("Perimeter is "+(2*(height+width)));
		System.out.println("Area is "+(height*width));
	}

}
