
public class StringCalculator {
    public int add(String inputString) {
        if (inputString.equals(""))
            return 0;

        // break up the string into an array
        String[] brokeUpInput = inputString.split(",");

        // Now add the numbers together
        Integer result = 0;
        for (int i = 0; i < brokeUpInput.length; i++)
        {
            result += Integer.parseInt(brokeUpInput[i]);
        }

        // Return result
        return result;
    }
}
