package pokemons;

import fly.NoFly;

public class Pikachu extends Pokemon {
    public Pikachu(int hp, int attackPower, NoFly noFly, Skill[] skills) {
        super("피카츄", hp, attackPower, noFly, skills); // 부모 클래스에 생성자 호출
        System.out.println("PikaPika");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int Damage = getAttackPower() + 5 + this.skills[choice].getDamage();
        // System.out.println(); name is private
        System.out.println(name + " -> " + target.getName() + "에게 " + this.skills[choice].getName() + " (데미지 : " + Damage + ")"); // name is protected
        target.recieveDamage(Damage);
        System.out.println(target.getName() + "의 남은 HP : " + target.getHP());
    }
}
