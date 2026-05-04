import java.util.*;

public class Day2Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            int maxRed = 0, maxGreen = 0, maxBlue = 0;

            String[] parts = line.split(":")[1].split("[,;]");

            for (String part : parts) {
                part = part.trim();
                String[] tokens = part.split(" ");

                int count = Integer.parseInt(tokens[0]);
                String color = tokens[1];

                if (color.equals("red"))
                    maxRed = Math.max(maxRed, count);

                if (color.equals("green"))
                    maxGreen = Math.max(maxGreen, count);

                if (color.equals("blue"))
                    maxBlue = Math.max(maxBlue, count);
            }

            sum += (maxRed * maxGreen * maxBlue);
        }

        System.out.println(sum);
    }
}