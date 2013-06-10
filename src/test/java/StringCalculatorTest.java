import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new StringCalculator();
	}

	@Test
	public void emptyInputStringShouldResultInZero() {
		String inputString = "";
		int expectedSum = 0;

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with an empty input",
							expectedSum, actualSum);
	}

	@Test
	public void singleNumberInputShouldReturnTheSameNumber() {
		String inputString = "1";
		int expectedSum = 1;

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with 1 argument", expectedSum,
							actualSum);
	}

	@Test
	public void twoArgumentsShouldBeAddedTogether() {
		StringCalculator calculator = new StringCalculator();

		String inputString = "1,2";
		int expectedSum = 3;

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with 2 arguments", expectedSum,
							actualSum);
	}
}
