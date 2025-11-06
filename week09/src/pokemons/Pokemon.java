package pokemons;

import fly.Flyable;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String name;
    private int hp;
    private int attackPower;
    protected Flyable flyingTool; // has-a (Aggregation)
    public Skill[] skills;

    public Pokemon(String name, int hp, int attackPower, Flyable flyingTool, Skill[] skills) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.flyingTool = flyingTool;
        this.skills = skills;
    }

    public String getName() { return name; }
    public int getHP() { return hp; }
    public int getAttackPower() { return attackPower; }
    public abstract void attack(Pokemon target, int choice);

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFlyingTool(Flyable flyingTool) { this.flyingTool = flyingTool; }

    public void performFlyable() { this.flyingTool.fly(this); }

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