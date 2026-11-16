public class main {
    public static void main(String[] args) {
        int number = 527;
        
        // separate digits using / and % only
        int hundreds = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int ones = remainder % 10;

        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Digits: " + hundreds + ", " + tens + ", " + ones);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
