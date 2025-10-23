public class GameDemo {
    public static void main(String[] args) {
        Jetpack jetpack = new Jetpack();

        Pikachu P1 = new Pikachu(100, 27);
        P1.setFlyingTool(new NoFly());
        P1.performFlyable();
        P1.setFlyingTool(jetpack);
        P1.performFlyable();

//        Pikachu P2 = new Pikachu(100, 28);
//        Squirtle S1 = new Squirtle(120, 21);
        Charizard C1 = new Charizard(200, 40);
        C1.setFlyingTool(new Wings());
        C1.performFlyable();

        System.out.println("전투 시작!");
        System.out.println(P1);
        System.out.println(C1);
        System.out.println("-----------------");

        int turn = 1;

        while (!P1.isFainted() && !C1.isFainted()) {
            System.out.println("턴 " + turn + " 시작");
            P1.attack(C1);
            if (C1.isFainted()) {
                System.out.println(C1.getName() + "이(가) 기절했습니다! " + P1.getName() + " 승리!");
                break;
            }
            C1.attack(P1);
            if (P1.isFainted()) {
                System.out.println(P1.getName() + "이(가) 기절했습니다! " + C1.getName() + " 승리!");
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
