/**
 * Created with IntelliJ IDEA.
 * User: Dave
 * Date: 04/06/13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    private int gameScore = 0;

    public int score() {
        return gameScore;  // Change body to return actual score
    }

    public void roll(int scorePerRoll) {
        gameScore += scorePerRoll;
    }
}
