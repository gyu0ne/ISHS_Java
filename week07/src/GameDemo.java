import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Pokemon playerPokemon = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("스타팅 포켓몬 선택\n(1 : 피카츄, 2 : 꼬부기, 3 : 리자몽) : ");
        int number = scanner.nextInt();
        if (number==1) {
            playerPokemon = new Pikachu(100, 27, new NoFly());
        } else if (number==2) {
            playerPokemon = new Squirtle(120, 21, new NoFly());
        } else if (number==3) {
            playerPokemon = new Charizard(200, 40, new Wings());
        }

        Pokemon enemyPokemon = null;
        System.out.println("야생의 포켓몬이 나타났다!");

        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);

        if (randomNumber==0) {
            enemyPokemon = new Pikachu(100, 27, new NoFly());
        } else if (randomNumber==1) {
            enemyPokemon = new Squirtle(120, 21, new NoFly());
        } else if (randomNumber==2) {
            enemyPokemon = new Charizard(200, 40, new Wings());
        }

//        Jetpack jetpack = new Jetpack();
//
//        Pikachu P1 = new Pikachu(100, 27, new NoFly());
////        P1.setFlyingTool(new NoFly());
//        P1.performFlyable();
//        P1.setFlyingTool(jetpack);
//        P1.performFlyable();
//
////        Pikachu P2 = new Pikachu(100, 28);
////        Squirtle S1 = new Squirtle(120, 21);
//        Charizard C1 = new Charizard(200, 40, new Wings());
////        C1.setFlyingTool(new Wings());
//        C1.performFlyable();
//
//        System.out.println("전투 시작!");
//        System.out.println(P1);
//        System.out.println(C1);
//        System.out.println("-----------------");
//
//        int turn = 1;
//
//        while (!P1.isFainted() && !C1.isFainted()) {
//            System.out.println("턴 " + turn + " 시작");
//            P1.attack(C1);
//            if (C1.isFainted()) {
//                System.out.println(C1.getName() + "이(가) 기절했습니다! " + P1.getName() + " 승리!");
//                break;
//            }
//            C1.attack(P1);
//            if (P1.isFainted()) {
//                System.out.println(P1.getName() + "이(가) 기절했습니다! " + C1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("-----------------");
//            turn++;
//        }
//        System.out.println("전투 종료!");
////        System.out.println("game start");
////        myPikachu.attack(yourPikachu);
////        for (int i=0; i<5; i++) {
////            someonesSquirtle.attack(myPikachu);
////        }
////        yourPikachu.attack(someonesSquirtle);
////
////        System.out.println(myPikachu);
////        System.out.println(yourPikachu);
////        System.out.println(someonesSquirtle);
    }
}
