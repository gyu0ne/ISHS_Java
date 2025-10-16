public class GameDemo {
    public static void main(String[] args) {
        Pikachu P1 = new Pikachu(100, 27);
        Pikachu P2 = new Pikachu(100, 28);
        Squirtle S1 = new Squirtle(120, 21);

        System.out.println("전투 시작!");
        System.out.println(P1);
        System.out.println(S1);
        System.out.println("-----------------");

        int turn = 1;

        while (!P1.isFainted() && !S1.isFainted()) {
            System.out.println("턴 " + turn + " 시작");
            P1.attack(S1);
            if (S1.isFainted()) {
                System.out.println(S1.getName() + "이(가) 기절했습니다! " + P1.getName() + " 승리!");
                break;
            }
            S1.attack(P1);
            if (P1.isFainted()) {
                System.out.println(P1.getName() + "이(가) 기절했습니다! " + S1.getName() + " 승리!");
                break;
            }
            System.out.println("-----------------");
            turn++;
        }
        System.out.println("전투 종료!");
//        System.out.println("game start");
//        myPikachu.attack(yourPikachu);
//        for (int i=0; i<5; i++) {
//            someonesSquirtle.attack(myPikachu);
//        }
//        yourPikachu.attack(someonesSquirtle);
//
//        System.out.println(myPikachu);
//        System.out.println(yourPikachu);
//        System.out.println(someonesSquirtle);
    }
}
