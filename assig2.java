public class Assigment3{
    public static void main(String[] args) {

        int num = 527;

        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        
        System.out.println("Sum = " + (a + b + c));
        System.out.println("Product = " + (a * b * c));
    }
}