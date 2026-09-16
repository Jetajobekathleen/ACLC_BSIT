public class Main {
    public static void main(String[] args) {
        int number = 527;

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Number = " + number);
        System.out.println("Hundreds = " + hundreds);
        System.out.println("Tens = " + tens);
        System.out.println("Ones = " + ones);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}