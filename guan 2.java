public class Exercise2 {
    public static void main(String[] args) {

        int seconds = 185;
        int minutes = seconds / 60;
        int remaining = seconds % 60;

        System.out.println("Minutes = " + minutes);
        System.out.println("Remaining Seconds = " + remaining);
    }
}