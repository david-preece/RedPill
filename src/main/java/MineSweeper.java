/**
 * Created with IntelliJ IDEA.
 * User: Dave&Zita
 * Date: 05/06/13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class MineSweeper {
    public String reveal(String input) {

        if (input.equals("."))
            return "0"; // Player Missed!
        else if (input.equals("*"))
            return "*"; // Player Hit!
        return null;  // Something went wrong, return null;
    }
}
