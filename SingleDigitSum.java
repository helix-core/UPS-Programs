import java.util.Scanner;

public class SingleDigitSum {
    public static int addDigitsUntilOneDigit(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        System.out.println("The final single digit is: " + addDigitsUntilOneDigit(number));
    }
}
