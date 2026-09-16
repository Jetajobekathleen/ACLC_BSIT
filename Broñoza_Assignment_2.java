public class Main {
    public static void main(String[] args) {
        int totalSeconds = 185;

        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        System.out.println("Total Seconds = " + totalSeconds);
        System.out.println("Minutes = " + minutes);
        System.out.println("Remaining Seconds = " + remainingSeconds);
    }
}