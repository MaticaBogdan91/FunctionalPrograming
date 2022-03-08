import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakeWhileVSFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 3, 3, 9, 1, 4, 5, 8, 96, 3, 66, 3, 3, 3));

//        System.out.println("FILTER");
//        numbers.stream().filter(number -> number % 3 == 0).forEach(System.out::println);

//        System.out.println("TAKE WHILE");
//        numbers.stream().takeWhile(number -> number % 3 == 0).forEach(System.out::println);

//        System.out.println("DROP WHILE");
//        numbers.stream().dropWhile(number -> number % 3 == 0).forEach(System.out::println);

    }
}
