import java.util.*;

public class Day1Part2 {
    static String[] words = {
        "zero","one","two","three","four",
        "five","six","seven","eight","nine"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            List<Integer> digits = new ArrayList<>();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                // If digit
                if (Character.isDigit(c)) {
                    digits.add(c - '0');
                }

                // If word
                for (int j = 1; j <= 9; j++) {
                    if (line.startsWith(words[j], i)) {
                        digits.add(j);
                    }
                }
            }

            int value = digits.get(0) * 10 + digits.get(digits.size() - 1);
            sum += value;
        }

        System.out.println(sum);
    }
}