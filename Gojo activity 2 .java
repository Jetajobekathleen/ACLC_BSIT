public class Main {
    public static void main(String[] args) {
        //  inputs. 2021,10,50(<,>)
        int a = 2021;
        int b = 10;
        int c = 50;

        int greatest = (a > b && a > c) ? a : (b > c ? b : c);
         //Expected value 2021

        System.out.println("Greatest value: " + greatest);
    }
}