import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapApp {
    public static void main(String[] args) {

        Faker faker = new Faker();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list1.add(faker.pokemon().name());
            list2.add(faker.pokemon().name());
            list3.add(faker.pokemon().name());
        }

//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(listOfLists);

        List<String> pokemons = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(pokemons);

    }
}
