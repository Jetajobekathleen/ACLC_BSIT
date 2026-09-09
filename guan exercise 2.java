public class Exercise2 {
    public static void main(String[] args) {

        int a = 2021;
        int b = 50;
        int c = 10;

        int value = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Greatest Value: " + value);
    }
}