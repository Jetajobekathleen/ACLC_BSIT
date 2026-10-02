import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        System.out.println("Enter a three-digit number: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int hundreds = value / 100;
        int tens = value / 10 % 10;
        int ones = value / 1 % 10;

        int sum = hundreds + tens + ones;
        System.out.println("sum: " + sum);

        int product = hundreds * tens * ones;
        System.out.println("product: " + product);

        input.close();

    
        
    }
}
