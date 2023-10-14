import java.util.Scanner;

public class PurchasePrice08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;

        System.out.println("input price: ");
        price = sc.nextInt();
        System.out.println("input quantity: ");
        quantity = sc.nextInt();

        totalPrice = price * quantity;
        totalDiscount = totalPrice * discount;

        purchasePrice = totalPrice - totalDiscount;

        System.out.println("Total Discount: " + totalDiscount);
        System.out.println("Final Purchase Price: " + purchasePrice );
    }
}