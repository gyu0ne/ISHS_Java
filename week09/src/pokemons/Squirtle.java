package pokemons;

import fly.NoFly;

public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower, NoFly noFly, Skill[] skills) {
        super("꼬부기", hp, attackPower, noFly, skills);
        System.out.println("GgoBukGgoBuk");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int Damage = getAttackPower() + 2 + this.skills[choice].getDamage();
        // System.out.println(); name is private
        System.out.println(name + " -> " + target.getName() + "에게 " + this.skills[choice].getName() + " (데미지 : " + Damage + ")"); // name is protected
        target.recieveDamage(Damage);
        System.out.println(target.getName() + "의 남은 HP : " + target.getHP());
    }
}
