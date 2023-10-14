import java.util.Scanner;

public class TernarySelection108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.println("Input number: ");
        double number = input08.nextDouble();

        // ternary operator checks if
        // the quotient value is 0 then it is even
        String result = (number % 2 == 0) ? "even number" : "odd number" ;

        System.out.println("This Number is an: " + result);
        input08.close();
    }
}