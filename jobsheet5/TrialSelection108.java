import java.util.Scanner;

public class TrialSelection108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = input08.nextInt();

        if (number % 2 == 0)
            System.out.println("Number "+ number +" even number");
        else 
            System.out.println("Number "+ number +" odd numbers");
    }
}