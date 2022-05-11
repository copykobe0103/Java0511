import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<String> pokemonList = new ArrayList<>();
        pokemonList.add("Charmander");
        pokemonList.add("Balbasaur");
        pokemonList.add("Squirtle");
//        pokemonList.remove(2);
        for (String pokemonName : pokemonList) {
            System.out.println("Pokemon Name = " + pokemonName);
        }

        System.out.println("Charmander Index = " + pokemonList.indexOf("Charmander"));
        System.out.println("Squirtle Index = " + pokemonList.indexOf("Squirtle"));
        System.out.println("arrayList size = " + pokemonList.size());

        Map<String, String> pokemonMap = new HashMap<>();
        pokemonMap.put("K1", "Charmander");
        pokemonMap.put("K2", "Balbasaur");
        pokemonMap.put("K3", "Squirtle");

        for (String key : pokemonMap.keySet()) {
            System.out.println("Map value = " + pokemonMap.get(key));
        }

        Pokemon pokemon1 = new Pokemon();
        pokemon1.setId("P1");
        pokemon1.setName("Charmander");
        pokemon1.setType("fire");
        pokemon1.setWeight(50);

        Pokemon pokemon2 = new Pokemon();
        pokemon2.setId("P2");
        pokemon2.setName("Squirtle");
        pokemon2.setType("water");
        pokemon2.setWeight(100);

        List<Pokemon> result = new ArrayList<>();
        result.add(pokemon1);
        result.add(pokemon2);
        System.out.println(result);

    }
}
