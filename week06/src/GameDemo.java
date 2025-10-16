public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100);
        Pikachu yourPikachu = new Pikachu(100);
        Squirtle someonesSquirtle = new Squirtle(120);
        System.out.println("game start");
        myPikachu.attack(yourPikachu);
        yourPikachu.attack(someonesSquirtle);
        someonesSquirtle.attack(myPikachu);
    }
}
