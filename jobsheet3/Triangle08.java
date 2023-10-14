import java.util.Scanner; //library data dari keyboard

public class Triangle08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //dc dapat diganti dg in ataupun input

        int base, height;
        float area;

        System.out.print("input base: ");
        base = sc.nextInt(); // jika tipe data double maka base = sc.nextDouble 
        System.out.print("Input height: ");
        height = sc.nextInt(); // jika tipe data string maka menggunakan base = sc.nextLine --> harus menambahkan sc.nextLine (menghindari enter terbaca nilai inputan)

        area = base * height / 2;

        System.out.println("Area of the triangle: " + area);
        
    }
}