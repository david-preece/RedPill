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
		game.roll();
	}

}
