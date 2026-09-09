public class Exercise2 {
      public static main void(String[] args){

        int a = 2021;
        int b = 10;
        int c = 50;

        int greatest;

        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c){
            greatest = b;
        } else {
            greatest = c;
        }
    
        System.out.println("Expected greatest value: ", greatest);
    }
}
