import java.util.*;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Kumar", "Tim", "John");
        names.sort((name1, name2) -> name1.compareTo(name2));
        names.forEach(name -> System.out.println(name));
    }
}