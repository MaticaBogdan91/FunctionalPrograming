import com.github.javafaker.Faker;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> pokemons = new ArrayList<>();
        pokemons.add("Pikachu");
        Faker faker = new Faker();
        for (int i = 0; i < 15; i++) {
            pokemons.add(faker.pokemon().name());
        }

        LocalTime start = LocalTime.now();
//        int nr = 0;
//        for (String pokemon : pokemons) {
//            if (pokemon.equalsIgnoreCase("pikachu"))
//                nr++;
//        }
//        System.out.println("PROCEDURAL: Am gasit " + nr + " pikachui in "
//                + ChronoUnit.NANOS.between(start, LocalTime.now()) + " nanosecunde");
//
////        pokemons.forEach(pokemon -> System.out.println(pokemon));
////        pokemons.forEach(System.out::println);
//
//        start = LocalTime.now();
//        List<String> filteredPokemons = pokemons.stream()
//                .filter(pokemon -> pokemon.equalsIgnoreCase("pikachu")).collect(Collectors.toList());
//
//        System.out.println("FUNCTIONAL: Am gasit " + filteredPokemons.size() + " pikachui in "
//                + ChronoUnit.NANOS.between(start, LocalTime.now()) + " nanosecunde");
//
//        start = LocalTime.now();
//        List<String> filteredPokemonsParallel = pokemons.parallelStream()
//                .filter(pokemon -> pokemon.equalsIgnoreCase("pikachu")).collect(Collectors.toList());
//
//        System.out.println("Paralel FUNCTIONAL: Am gasit " + filteredPokemonsParallel.size() + " pikachui in "
//                + ChronoUnit.NANOS.between(start, LocalTime.now()) + " nanosecunde");

//        final Predicate<String> pikachuPredicate = pokemon -> pokemon.equalsIgnoreCase("pikachu");
//        pokemons.stream().filter(pikachuPredicate)
//                .map(String::toUpperCase).distinct().forEach(System.out::println);
//
//        pokemons.stream()
//                .peek(pokemon -> System.out.println(pokemon))
//                .map(String::toUpperCase)
//                .peek(pokemon -> System.out.println(pokemon))
//                .sorted()
//                .peek(x -> System.out.println("-------------"))
//                .forEach(System.out::println);

//        System.out.println(pokemons.stream().filter(p -> p.equalsIgnoreCase("pikachu")).toArray());

        for (Object pokemon : pokemons.stream().filter(p -> p.equalsIgnoreCase("pikachu")).toArray()             ) {
            System.out.println(pokemon);
        }

        //TODO: Comparable
    }
}
