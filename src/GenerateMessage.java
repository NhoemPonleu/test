public class GenerateMessage {
    public static void main(String[] args) {
        String codePrefix = "TRM025";
        String codeSuffix = "_EN";
        int count = 2;
        int startingNumber = 6;
        String[] errorDescriptions = {
                "Zero Value Error : Adjusted Face Value should not be zero!",
                "Code Error: Business Code of Provision PL Account Code should be Treasury Management!"
        };

        StringBuilder result = new StringBuilder();

        for (int i = startingNumber; i <= startingNumber + count - 1; i++) {
            String code = codePrefix + String.format("%02d", i) + codeSuffix;
            String errorDescription = errorDescriptions[i - startingNumber];

            String errorMessage = errorDescription.toUpperCase()
                    .replaceAll("\\s+", "_")
                    .replaceAll("[-:.!?,]", "")
                    .replace(":", "_")
              //      .replace("CANCEL", "CANCEL_")
                    .replace("/","_")
                    .replace("'","")
                    .replace("MANAGEMENT","ponleu").toUpperCase().concat(String.valueOf(errorDescription.indexOf(0)))
                    .replace("__", "_");

            result.append(errorMessage).append("\n");
        }

        System.out.println(result.toString());
    }
}