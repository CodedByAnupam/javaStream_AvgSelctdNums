
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input1 = scanner.nextLine();
        if (input1.equals("n")) {
            System.out.println("Average of the negative numbers: " + numbers.stream().mapToInt(n -> Integer.valueOf(n)).filter(s -> s < 0).average().getAsDouble());
        } else if (input1.equals("p")) {
            System.out.println("Average of the positive numbers: " + numbers.stream().mapToInt(n -> Integer.valueOf(n)).filter(s -> s > 0).average().getAsDouble());
        }

    }
}
