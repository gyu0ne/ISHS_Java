public class Squirtle extends Pokemon {
    public Squirtle(int hp) {
        super("꼬부기", hp);
        System.out.println("GgoBukGgoBuk");
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(name + " --> " + target.getName() + "에게 물대포!!");
    }
}
