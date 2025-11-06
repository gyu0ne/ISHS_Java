package fly;

import pokemons.Pokemon;

public class Wings implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 날개로 날아");
    }
}
