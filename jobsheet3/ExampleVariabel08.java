public class ExampleVariabel08 {
    public static void main(String[] args) {
        String oneOfMyHobbies = "Swimming";

        boolean isSmart = true;
        char gender= 'F';
        byte _age = 20;
        double $gpa = 3.38, height = 1.68;

        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart? " + isSmart);
        System.out.println("Gender: " + gender);
        System.out.println("My current age is " + _age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height));
    }
}