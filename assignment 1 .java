public class QuarterRange {
    public static void main(String[] args) {
        int quarter = 2;
        String range;

        if (quarter == 1) {
            range = "1 - 3";
        } else if (quarter == 2) {
            range = "4 - 6";
        } else if (quarter == 3) {
            range = "7 - 9";
        } else if (quarter == 4) {
            range = "10 - 12";
        } else {
            range = "Invalid quarter";
        }

        System.out.println("Range = " + range);
    }
}
