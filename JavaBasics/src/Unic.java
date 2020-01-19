import java.util.stream.IntStream;

/**
 * Created by @techieasif on January, 2020
 */
public class Unic {
    public static void main(String[] args) {
        IntStream.range(0, 1000)
                .mapToObj(i -> "Char: " + i + " ==> " + new String(Character.toChars(i)))
                .forEach(System.out::println);
    }
}
