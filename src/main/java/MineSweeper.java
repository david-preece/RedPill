public class MineSweeper {
    public String reveal(String input) {

        if (input.equals("."))
            return "0";
        else
            input = input.replace ('.', '1');

        return input;
    }
}
