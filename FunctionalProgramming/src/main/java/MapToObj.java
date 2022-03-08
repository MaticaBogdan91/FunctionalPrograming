import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToObj {
    public static void main(String[] args)
    {
        IntStream stream = IntStream.range(3, 8);

        Stream<String> stream1 = stream.mapToObj(num
                -> Integer.toBinaryString(num));

        stream1.forEach(System.out::println);
    }
}
