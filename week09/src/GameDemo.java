import fly.NoFly;
import fly.Wings;
import pokemons.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Skill[] pikachuSkills = {
                new Skill("Nuzzle", 20),
                new Skill("ThunderShock", 40),
                new Skill("Quick Attack", 40)
        };

        Skill[] squirtleSkills = {
                new Skill("Tackle", 40),
                new Skill("Water Gun", 40),
                new Skill("Rapid Spin", 50)
        };

        Skill[] charizardSkills = {
                new Skill("Scratch", 40),
                new Skill("Dragon Breath", 60),
                new Skill("Flare Blitz", 120)
        };

        pokemons.Pokemon playerPokemon = null;
//        Pokemon playerPokemon = new Pikachu(100, 27, new NoFly());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("스타팅 포켓몬 선택\n(1 : 피카츄, 2 : 꼬부기, 3 : 리자몽) : ");

                int number = scanner.nextInt();

                if (number == 1) {
                    playerPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
                    break;
                } else if (number == 2) {
                    playerPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
                    break;
                } else if (number == 3) {
                    playerPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
                    break;
                } else {
                    System.out.println("1,2,3 중에 고르라고 답답아");
                }
            } catch (InputMismatchException err) {
                System.out.println("숫자로 입력하라고 답답아");
//                System.out.println(err.getMessage());
                scanner.nextLine(); // 버퍼 남아있는 값 제거
            }
        }

        Pokemon enemyPokemon = null;
        System.out.println("야생의 포켓몬이 나타났다!");

        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);

        if (randomNumber==0) {
            enemyPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
        } else if (randomNumber==1) {
            enemyPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
        } else if (randomNumber==2) {
            enemyPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
        }

//        fly.Jetpack jetpack = new fly.Jetpack();
//
//        pokemons.Pikachu P1 = new pokemons.Pikachu(100, 27, new fly.NoFly());
////        P1.setFlyingTool(new fly.NoFly());
//        P1.performFlyable();
//        P1.setFlyingTool(jetpack);
//        P1.performFlyable();
//
////        pokemons.Pikachu P2 = new pokemons.Pikachu(100, 28);
////        pokemons.Squirtle S1 = new pokemons.Squirtle(120, 21);
//        pokemons.Charizard C1 = new pokemons.Charizard(200, 40, new fly.Wings());
////        C1.setFlyingTool(new fly.Wings());
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
