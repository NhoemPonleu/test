import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String code = "TRM0468_EN";
        int count = 100;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            // Extract the numeric portion of the code
            int number = Integer.parseInt(code.substring(4, 7));

            // Increment the number
            number++;

            // Create the new code by combining the prefix, incremented number, and suffix
            code = code.substring(0, 4) + String.format("%03d", number) + code.substring(7);

            // Append the code to the result with the required format
            result.append(code).append(" (\"EN\",\"\",\"\"),\n");
        }

// Remove the trailing comma and newline
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

// Print the result
        System.out.println(result.toString());
    }
}