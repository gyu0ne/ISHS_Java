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

        System.out.println("전투 시작!");
        System.out.println("-----------------");

        for(int i=0; i<playerPokemon.skills.length; i++) {
            System.out.println((i+1) + ". " + playerPokemon.skills[i].getName() + " (" + playerPokemon.skills[i].getDamage() + ")");
        }

        System.out.print("Select Skill : ");
        int skillNumber = scanner.nextInt() - 1;

        enemyPokemon.setHp(enemyPokemon.getHP() - playerPokemon.skills[skillNumber].getDamage());
        System.out.println(enemyPokemon.getName() + "의 체력은 " + enemyPokemon.getHP() + "이 남았습니다.");

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
