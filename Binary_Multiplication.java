package exercises;
import java.util.*;

public class Binary_Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        long a = scanner.nextLong();

        System.out.print("Enter second binary number: ");
        long b = scanner.nextLong();

        long product = multiplyBinary(a, b);
        System.out.println("The result is: " + product);
    }

    public static long multiplyBinary(long a, long b) {
        long result = 0; 
        int multiplierControl = 0;

        while (b != 0) {
            long digit = b % 10; 
            
            if (digit == 1) { 
                result = addBinary(result, shiftLeftBinary(a, multiplierControl));
            }
            b /= 10; 
            multiplierControl++; 
        }
        return result;
    }

    public static long addBinary(long a, long b) {
        long result = 0;
        int carry = 0;
        int multiplier = 1;

        while (a != 0 || b != 0 || carry != 0) {
            int digit1 = (int) (a % 10);
            int digit2 = (int) (b % 10);

            int sum = digit1 + digit2 + carry;
            result += (sum % 2) * multiplier; 
            carry = sum / 2; //

            a /= 10;
            b /= 10;
            multiplier *= 10;
        }
        return result;
    }

    public static long shiftLeftBinary(long binary, int positions) {
        
        while (positions > 0) {
            binary *= 10; 
            positions--;
        }
        return binary;
    }
}
