import java.util.Scanner;

public class Activity2 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in); //ka cool ng command !!
        System.out.println("Input number:");

        int numb = input.nextInt();
        int hundreds = numb / 100;
        int tenths = numb / 10 % 10;
        int ones = numb / 1 % 10;
        int sum = hundreds + tenths + ones;
        int product = hundreds * tenths * ones;

        System.out.println();
        System.out.println("'" + numb + "'" + "  converted");
                System.out.println();
        System.out.println("From the hundreds:  " + hundreds);
        System.out.println("From the tens    :  " + tenths);
        System.out.println("From the ones    :  " + ones);
          System.out.println();
          System.out.println("the sum for the converted number is    :   " + sum);
          System.out.println("the product for the converted number is:   " + product);
          System.out.println(); //ma'am sumakit likod kow huhu
    }
}
