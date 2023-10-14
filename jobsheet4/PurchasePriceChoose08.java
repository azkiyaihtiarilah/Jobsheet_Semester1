import java.util.Scanner;

public class PurchasePriceChoose08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brandBook;
        int pageCount;
        int price, quantity;
        double discount, totalPrice, purchasePrice, totalDiscount;

        System.out.println("input Name Brand book: ");
        brandBook = sc.nextLine();
        System.out.println("input Page Count: ");
        pageCount = sc.nextInt();
        System.out.println("input price: ");
        price = sc.nextInt();
        System.out.println("input quantity: ");
        quantity = sc.nextInt();
        System.out.println("input discount: ");
        discount = sc.nextInt();

        totalPrice = price * quantity;
        totalDiscount = totalPrice * (discount / 100);

        purchasePrice = totalPrice - totalDiscount;

        System.out.println("Name Brand Book: " + brandBook);
        System.out.println("Name Page Count: " + pageCount);
        System.out.println("Total Discount: " + totalDiscount);
        System.out.println("Final Purchase Price: " + purchasePrice );
    }
}