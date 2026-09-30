public class jillian {

    public static void main(String[] args) {
        int quarter = 2;

        int starMonth = (quarter - 1) * 3 + 1;
        int endMonth = quarter * 3;

        System.out.print("Range = " + starMonth + "-" + endMonth);
    }
}