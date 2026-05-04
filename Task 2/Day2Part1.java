import java.util.*;

public class Day2Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int gameId = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            boolean valid = true;

            String[] parts = line.split(":")[1].split("[,;]");

            for (String part : parts) {
                part = part.trim();
                String[] tokens = part.split(" ");

                int count = Integer.parseInt(tokens[0]);
                String color = tokens[1];

                if ((color.equals("red") && count > 12) ||
                    (color.equals("green") && count > 13) ||
                    (color.equals("blue") && count > 14)) {
                    valid = false;
                }
            }

            if (valid) sum += gameId;

            gameId++;
        }

        System.out.println(sum);
    }
}