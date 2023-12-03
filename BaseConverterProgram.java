import java.util.Scanner;
 
public class BaseConverterProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Base Program");
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
 
        System.out.print("Original base number (2, 10, 16): ");
        int sourceBase = scanner.nextInt();
 
        System.out.print("Destination base number (2, 10, 16): ");
        int targetBase = scanner.nextInt();
 
        if (isValidBase(sourceBase) && isValidBase(targetBase)) {
            String result = convertBase(number, sourceBase, targetBase);
            System.out.println(number + " (Base " + sourceBase + ") = " + result + " (base " + targetBase + ")");
        } else {
            System.out.println("Please enter a valid base number. (2, 10, 16)");
        }
 
        // ปิด Scanner
        scanner.close();
    }
 
    private static boolean isValidBase(int base) {
        return base == 2 || base == 10 || base == 16;
    }
 
    private static String convertBase(int number, int sourceBase, int targetBase) {
        String result = "";
 
        if (sourceBase == 10) {
            result = convertFromDecimal(number, targetBase);
        } else {
            int decimalNumber = convertToDecimal(number, sourceBase);
            result = convertFromDecimal(decimalNumber, targetBase);
        }
 
        return result;
    }
 
    private static int convertToDecimal(int number, int sourceBase) {
        return Integer.parseInt(Integer.toString(number), sourceBase);
    }
 
    private static String convertFromDecimal(int decimalNumber, int targetBase) {
        return Integer.toString(decimalNumber, targetBase);
    }
}
 