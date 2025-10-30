package fly;

import pokemons.Pokemon;

public class NoFly implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 못 날아");
    }
}
