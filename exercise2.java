public class exercise2 {
    public static void main(String[]args) {
        int x = 2021;
        int y = 50;
        int z = 10;
        int Value = ( x > y ) ? (( x > z) ? x : z) : (( z > x ) ? x : y);
        System.out.println(Value);
    }
}
