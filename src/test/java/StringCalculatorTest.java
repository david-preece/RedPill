import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class StringCalculatorTest {

	private StringCalculator calculator;
	private Random random = new Random();

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

	@Test
	public void unknownNumberOfArgumentsShouldBeAddedTogether() {
		StringBuilder sb = new StringBuilder();

		int numberOfArguments = randomInt();
		int expectedSum = 0;

		for (int i = 1; i <= numberOfArguments; i++) {
			final int input = randomInt();
			sb.append(input);
			if (i < numberOfArguments) {
				sb.append(",");
			}
			expectedSum += input;
		}

		String inputString = sb.toString();

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with " + numberOfArguments +
							" number of arguments", expectedSum, actualSum);
	}

	@Test
	public void linesShouldBeTreatedAsDelimiters() {
		String inputString = "1\n2,3";
		int expectedSum = 6;

		int actualSum = calculator.add(inputString);

		Assert.assertEquals("The calculator did not sum the numbers correctly with line breaks", expectedSum,
							actualSum);
	}

	private int randomInt() {
		return random.nextInt(100);
	}
}
