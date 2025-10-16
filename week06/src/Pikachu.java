public class Pikachu extends Pokemon {
    public Pikachu(int hp, int attackPower) {
        super("피카츄", hp, attackPower); // 부모 클래스에 생성자 호출
        System.out.println("PikaPika");
    }

    @Override
    public void attack(Pokemon target) {
        int Damage = getAttackPower() + 5;
        // System.out.println(); name is private
        System.out.println(name + " -> " + target.getName() + "에게 백만볼트!! (데미지 : " + Damage + ")"); // name is protected
        target.recieveDamage(Damage);
        System.out.println(target.getName() + "의 남은 HP : " + target.getHP());
    }
}
