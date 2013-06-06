import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MineSweeperTest {

	private MineSweeper mineSweeper;

	@Before
	public void setUp() {
		mineSweeper = new MineSweeper();
	}

	@Test
	public void revealingABoardWithoutAMineShouldWork() {

		String input = ".";
		String expectedOutput = "0";

		String actualOutput = mineSweeper.reveal(input);

		Assert.assertEquals("Could not reveal the hints properly", expectedOutput, actualOutput);

	}

	@Test
	public void revealingASingleMineShouldWork() {

		String input = "*";
		String expectedOutput = "*";

		String actualOutput = mineSweeper.reveal(input);

		Assert.assertEquals("Could not reveal the hints properly", expectedOutput, actualOutput);

	}

	@Test
	public void revealingSmallBoardShouldWork() {

		String input = "*.\n" + "..";

		String expectedOutput = "*1\n" + "11";

		String actualOutput = mineSweeper.reveal(input);

		Assert.assertEquals("Could not reveal the hints properly", expectedOutput, actualOutput);

	}

}
