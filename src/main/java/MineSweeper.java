public class MineSweeper {
    public String reveal(String input) {

        /**
        if (input.equals("."))
            return "0";
        else
            input = input.replace ('.', '1');

        return input;    */

        // Replace newlines with ^ to split the board up
        input = input.replace('\n', '^');

        // Split the board
        String[] lines = input.split("^");
        String[] result = new String[lines.length];

        // this for loop represents each line in the board
        for (int lineCount = 0; lineCount < lines.length; lineCount++)
        {
            // This for loop represents each point in the line
            for (int pointCount = 0; pointCount < lines[lineCount].length(); pointCount++)
            {
                int howManyMines = 0;
                if (lineCount == 0)   // top row so no need to check above
                {
                    if (pointCount == 0) // first point, no need to check left
                    {
                        if (pointCount == lines[lineCount].length() - 1) // far right point, dont check right
                        {
                            // My head has just exploded!!!!!!!!!!!!
                        }
                    }
                }
            }
        }
    }
}
