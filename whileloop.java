public class whileloop {
    public static void main(String[]args){
        int pokemons = 0;
        while (pokemons <= 1205) {
            System.out.println("There are " + pokemons + " pokemons");
            pokemons++;
            try {
            Thread.sleep(25);
            }catch (InterruptedException e){}
        }
    }
}
