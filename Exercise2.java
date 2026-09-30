class exercise2 {
    public static void main (String[] args) {
        int x = 2021;
        int y = 50;
        int z = 10;
        int value = ( x > y) ? (( x > y ) ? x : z) : (( z > x ) ? x : y);
        System.out.println(value);
    }
}