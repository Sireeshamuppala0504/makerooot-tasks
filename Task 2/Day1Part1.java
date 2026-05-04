import java.util.*;

public class Day1Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            char first = '0', last = '0';

            // find first digit
            for (char c : line.toCharArray()) {
                if (Character.isDigit(c)) {
                    first = c;
                    break;
                }
            }

            // find last digit
            for (int i = line.length() - 1; i >= 0; i--) {
                if (Character.isDigit(line.charAt(i))) {
                    last = line.charAt(i);
                    break;
                }
            }

            int value = Integer.parseInt("" + first + last);
            sum += value;
        }

        System.out.println(sum);
    }
}