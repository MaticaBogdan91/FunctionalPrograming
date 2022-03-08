import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> {
                    System.out.println("ELEMENT: " + element);
                    subtotal = subtotal + element;
                    System.out.println("SUBTOTAL: " + subtotal);
                    return subtotal;
                });

        System.out.println(result);
    }
}
