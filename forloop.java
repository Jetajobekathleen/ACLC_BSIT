import java.util.Scanner;
public class forloop {
    public static void main(String[]args){
        System.out.println("Multiplication: ");
        Scanner yay = new Scanner(System.in);
        System.out.println();
        System.out.print("Input number: ");
        int num = yay.nextInt();
        for (int multiplier = 1 ; multiplier <= 12 ; ++multiplier) {
            System.out.println("2 x " + multiplier + " = " + num*multiplier);
        } yay.close();
    } 
}
