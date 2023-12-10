import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner TequilloScanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double firstNumber = TequilloScanner.nextDouble();


        System.out.print("Enter the second number: ");
        double secondNumber = TequilloScanner.nextDouble();


        teqCompareNum(firstNumber, secondNumber);
        TequilloScanner.close();
    }

    public static void teqCompareNum(double fn1, double sn2) {
        if (fn1 < sn2) {
            System.out.println("The first number is less than the second number.");
            
        } else if (fn1 > sn2) {
            System.out.println("The first number is greater than the second number.");
            
        } else {
            System.out.println("The first number is equal to the second number.");
        }
    }
}