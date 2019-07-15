package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("Charmander", "fire", 100);
		Pokemon pikachu = pokedex.createPokemon("Pikachu", "electric", 50);
		
		pokedex.attackPokemon(charmander);
		pokedex.pokemonInfo(charmander);
		pokedex.attackPokemon(pikachu);
		pokedex.pokemonInfo(pikachu);
	}
}
