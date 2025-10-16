public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower) {
        super("꼬부기", hp, attackPower);
        System.out.println("GgoBukGgoBuk");
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(name + " --> " + target.getName() + "에게 물대포!!");
    }
}
