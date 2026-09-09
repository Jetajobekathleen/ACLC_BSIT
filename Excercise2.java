public class Excercise2 {
    public static void main(String[] args) {
        int A = 2021, B = 10, C = 50;
        int Greater = (A > B && A > C) ? A : (B > C ? B : C );
        System.out.print(Greater);

    }
}