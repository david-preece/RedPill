import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void shouldReturnTheScore() {
		int expectedScore = 0;
		int actualScore = game.score();

		Assert.assertEquals("Score reported from the game is not what it should be", expectedScore,
							actualScore);
	}

	@Test
	public void shouldBeAbleToRoll() {
		game.roll(0);
	}

	@Test
	public void shouldNotScoreEvenIfRollingMany() {

		final int scorePerRoll = 0;
		final int numberOfRolls = 20;

		for (int i = 0; i < numberOfRolls; i++) {
			game.roll(scorePerRoll);
		}

		int expectedScore = 0;
		int actualScore = game.score();

		Assert.assertEquals("Rolling no score in the game resulted in score above 0", expectedScore,
							actualScore);
	}

	@Test
	public void shouldCountScoreWhenScoring() {

		final int scorePerRoll = 1;
		final int numberOfRolls = 20;

		for (int i = 0; i < numberOfRolls; i++) {
			game.roll(scorePerRoll);
		}

		int expectedScore = scorePerRoll * numberOfRolls;
		int actualScore = game.score();

		Assert.assertEquals("Rolling all ones in the game did not result in 20", expectedScore, actualScore);
	}

}
