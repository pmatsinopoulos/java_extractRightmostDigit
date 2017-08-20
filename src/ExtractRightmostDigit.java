import java.util.Scanner;
/* Asks the user for an integer.
   Asks the user for the number of digits to extract.
   Prints the extracted digits.
*/
public class ExtractRightmostDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me an integer: ");
        int integer = in.nextInt();
        
        System.out.print("Give me the number of digits to extract: ");
        int numberOfDigitsToExtract = in.nextInt();
        
        int result = integer % (int) Math.pow(10, numberOfDigitsToExtract);
        System.out.printf("Extracted digits: %d\n", result);
        
        in.close();
    }
}