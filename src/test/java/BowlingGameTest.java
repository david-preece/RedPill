import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void classUnderTestShouldExist() {
		Game game = new Game();
	}

	@Test
	public void shouldReturnTheScore() {
		Game game = new Game();
		int expectedScore = 0;
		int actualScore = game.score();

		Assert.assertEquals("Score reported from the game is not what it should be", expectedScore,
							actualScore);
	}

}
