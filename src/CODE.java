import java.util.ArrayList;
import java.util.List;

public class CODE {
    public static void main(String[] args) {
        String code = "CCI0080_EN"; // Update the initial code
        int count = 500; // Update the desired count

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            // Append the code to the result with the required format
            result.append(code).append(" (\"EN\",\"\",\"\"),\n");

            // Extract the numeric portion of the code
            int number = Integer.parseInt(code.substring(3, 7));

            // Increment the number by 1
            number += 1;

            // Create the new code by combining the prefix, incremented number, and suffix
            code = code.substring(0, 3) + String.format("%04d", number) + code.substring(7);
        }

        // Remove the trailing comma and newline
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        // Print the result
        System.out.println(result.toString());
    }
}