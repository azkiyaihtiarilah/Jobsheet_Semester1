import java.util.Scanner;

public class Bank08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int init_sav_amout, sav_period;
        double final_sav_amout, interest, interest_percent = 0.02;

        System.out.print("Input your initial savings amount: ");
        init_sav_amout = sc.nextInt();
        System.out.print("Input your savings period: ");
        sav_period = sc.nextInt();

        interest = sav_period * interest_percent * init_sav_amout;

        final_sav_amout = interest + init_sav_amout;

        System.out.println("Interest: " + interest);
        System.out.println("Final savings amount: " + final_sav_amout);
    }
}
