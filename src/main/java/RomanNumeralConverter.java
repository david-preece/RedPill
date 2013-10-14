/**
 * Project: red-pill
 * User: Dave
 * Date: 07/06/13
 * Time: 14:36
 */
public class RomanNumeralConverter {
    public String convert(int numberToConvert) {

        // Additional code to use traditional RN

        String result = "";



        switch (numberToConvert)
        {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "VI";
            case 5:
                return "V";
            default:
                return null;
        }
    }
}
