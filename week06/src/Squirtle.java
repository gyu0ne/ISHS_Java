public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower) {
        super("꼬부기", hp, attackPower);
        System.out.println("GgoBukGgoBuk");
    }

    @Override
    public void attack(Pokemon target) {
        int Damage = getAttackPower() + 5;
        // System.out.println(); name is private
        System.out.println(name + " -> " + target.getName() + "에게 물대포!! (데미지 : " + Damage + ")"); // name is protected
        target.setHp(target.getHP() - Damage);    }
}
