public class Exercise3 {
    public static void main(String[] args) {

        int number = 527;

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        int sum = a + b + c;
        int product = a * b * c;

        System.out.println("First Digit = " + a);
        System.out.println("Second Digit = " + b);
        System.out.println("Third Digit = " + c);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}