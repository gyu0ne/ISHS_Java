public abstract class Pokemon {
    protected String name;
    private int hp;
    private int attackPower;

    public Pokemon(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public int getHP() { return hp; }
    public int getAttackPower() { return attackPower; }
    public abstract void attack(Pokemon target);

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void recieveDamage(int Damage) {
        hp = hp - Damage;
        if (hp <= 0) {
            hp = 0;
        }
    }

    public boolean isFainted() {
        return hp <= 0;
    }

    @Override
    public String toString() {
        return name + "(HP : " + hp + " AttackPower : " + attackPower + ')';
    }
}