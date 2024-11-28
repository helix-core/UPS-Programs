import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LambdaEven {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> num = new ArrayList<>();
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        num.add(scanner.nextInt());
    }
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    num.forEach(val -> {
        if (val % 2 == 0) {
            even.add(val);
        } else {
            odd.add(val);
        }
    });
    System.out.println("even: "+even);
    System.out.println("odd: "+odd);
}
}
