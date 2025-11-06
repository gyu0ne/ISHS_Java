package pokemons;

import fly.Wings;

public class Charizard extends Pokemon {
    public Charizard(int hp, int attackPower, Wings wings, Skill[] skills) {
        super("리자몽", hp, attackPower, wings, skills); // 부모 클래스에 생성자 호출
        System.out.println("ZamongZamong");
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