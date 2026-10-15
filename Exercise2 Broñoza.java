public class Exercise2 {
    public static void main(String[] args) {
        int a = 2021;
        int b = 10;
        int c = 50;

        int greatest = (a > b && a > c) ? a : (b > c ? b : c);

        System.out.println(greatest);
    }
}