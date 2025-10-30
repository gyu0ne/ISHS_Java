package fly;

import pokemons.Pokemon;

public class Jetpack implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 제트팩 타고 날아");
    }
}
