public class Pikachu extends Pokemon {
    public Pikachu(int hp) {
        super("피카츄", hp); // 부모 클래스에 생성자 호출
        System.out.println("PikaPika");
    }

    @Override
    public void attack(Pokemon target) {
        // System.out.println(); name is private
        System.out.println(name + " -> " + target.getName() + "에게 백만볼트!!"); // name is protected
    }
}
