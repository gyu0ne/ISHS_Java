public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100, 27);
        Pikachu yourPikachu = new Pikachu(100, 28);
        Squirtle someonesSquirtle = new Squirtle(120, 21);
        System.out.println("game start");
        myPikachu.attack(yourPikachu);
        for (int i=0; i<5; i++) {
            someonesSquirtle.attack(myPikachu);
        }
        yourPikachu.attack(someonesSquirtle);

        System.out.println(myPikachu);
        System.out.println(yourPikachu);
        System.out.println(someonesSquirtle);
    }
}
