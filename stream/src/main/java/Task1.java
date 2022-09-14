import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Java","Apple","Honda","Developer");
        words.stream()
                .map(w->w.length())
                .forEach(System.out::println);
    }
}
