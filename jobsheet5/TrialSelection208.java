import java.util.Scanner;

public class TrialSelection208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Grade Uas  :");
        float uas = input08.nextFloat();
        System.out.print("Grade Uts  :");
        float uts = input08.nextFloat();
        System.out.print("Grade Quiz :");
        float quiz = input08.nextFloat();
        System.out.print("Grade Task :");
        float task = input08.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (quiz * 0.1F) + (task * 0.2F);

        String message = total < 65 ? "Remedial" : "Not remedial";

        System.out.println("Final Grade = " + total+ " so "+ message);
    }
}