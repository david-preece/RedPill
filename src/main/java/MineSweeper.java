public class MineSweeper {

    private String[] boardArray;

    private void setBoard (String boardInput)
    {
        // replace the \n with ^
        boardInput = boardInput.replace('\n', '`');

        // Split the board
        this.boardArray = boardInput.split("`");
    }

    private int testPoint (int lineCount, int pointCount)
    {
        try
        {
            // This will test the point in the given position for a mine
            if (this.boardArray[lineCount].charAt(pointCount) == '*')
                return 1; // 1 represents a mine
            else
                return 0; // 0 represents nothing
        } catch (ArrayIndexOutOfBoundsException e)
        {
            return 0; // 0 represents nothing
        } catch (StringIndexOutOfBoundsException e)
        {
            return 0; // 0 represents nothing
        }
    }

    public String reveal(String input) {

        // empty board
        if (input.equals("."))
            return "0";

        // Setup the board
        this.setBoard(input);

        // Result
        String result = "";

        // For loop to represent each line of the board
        for (int lineCount = 0; lineCount < this.boardArray.length; lineCount++)
        {
            // For loop to represent the individual points in the lines
            for (int pointCount = 0; pointCount < this.boardArray[lineCount].length(); pointCount++)
            {
                if (this.boardArray[lineCount].charAt(pointCount) == '*')
                {
                    result += "*";
                    continue;
                }

                // Represents the mines around the current board
                int howManyMines = 0;

                howManyMines += this.testPoint(lineCount-1, pointCount-1);  // top left
                howManyMines += this.testPoint(lineCount-1, pointCount);    // above
                howManyMines += this.testPoint(lineCount-1, pointCount+1);  // top right
                howManyMines += this.testPoint(lineCount, pointCount-1);    // left
                howManyMines += this.testPoint(lineCount, pointCount+1);    // right
                howManyMines += this.testPoint(lineCount+1, pointCount-1);  // bottom left
                howManyMines += this.testPoint(lineCount+1, pointCount);    // below
                howManyMines += this.testPoint(lineCount+1, pointCount+1);  // bottom right

                // Add the result to the string
                result += howManyMines;
            }
            if (lineCount != (this.boardArray.length-1))    // Enter new line unless at end of board
                result += "\n";
        }

        return result;
    }
}
