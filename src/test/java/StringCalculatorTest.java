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
		StringCalculator calculator = new StringCalculator();

		String inputString = "";
		int expectedSum = 0;

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with an empty input",
							expectedSum, actualSum);
	}
}
