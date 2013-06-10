/**
 * Project: red-pill
 * User: Dave
 * Date: 07/06/13
 * Time: 14:36
 */
public class RomanNumeralConverter {
    public String convert(int numberToConvert) {
        switch (numberToConvert)
        {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            default:
                return null;
        }
    }
}
