package pokemon;

public class Pokedex extends AbstractPokemon {

	@Override
	public void pokemonInfo(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
		System.out.println("Name: "+pokemon.getName()+" Health: "+pokemon.getHealth()+" Type: "+pokemon.getType());
	}
}
