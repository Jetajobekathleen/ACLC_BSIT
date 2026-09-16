public class Main {
    public static void main(String[] args) {
        int quarter = 2;

        int startMonth = (quarter - 1) * 3 + 1;
        int endMonth = quarter * 3;

        System.out.println("Quarter = " + quarter);
        System.out.println("Range = " + startMonth + " - " + endMonth);
    }
}