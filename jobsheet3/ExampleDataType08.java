public class  ExampleDataType08{
    public static void main(String[] args) {
        char bloodGroup= 'A';
        byte distance =  (byte) 130;
        short theNumberOfResidents= 1025;
        float temperature = 60.50F;
        double weight =  0.5467812345;
        long balance = 150000000;
        int number = 0x10;

        System.out.println("Blood group \t\t: " + (byte) bloodGroup);
        System.out.println("Distence\t\t: " + distance);
        System.out.println("The number of resudents\t: " + theNumberOfResidents);
        System.out.println("Temperature\t\t: " + temperature);
        System.out.println("Weight\t\t\t: " + (float) weight);
        System.out.println("Balance\t\t\t: " + balance);
        System.out.println("Number\t\t\t: " + number);
    }
}