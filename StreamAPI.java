import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmed", "Girish", "Mathi", "Arun", "Shiva");

        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))      
            .map(String::toUpperCase)                   
            .collect(Collectors.toList());           

        for(String name:filteredNames){
            System.out.println(name);
        }
    }
}
