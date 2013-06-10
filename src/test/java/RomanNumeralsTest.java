import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

	private RomanNumeralConverter converter;

	@Before
	public void setUp() throws Exception {
		converter = new RomanNumeralConverter();
	}

	@Test
	public void shouldConvertOne() {

		int numberToConvert = 1;
		String expectedResult = "I";
		String actualResult = converter.convert(numberToConvert);

		Assert.assertEquals("The converter could not convert the number properly", expectedResult,
							actualResult);
	}

	@Test
	public void shouldConvertTwo() {

		int numberToConvert = 2;
		String expectedResult = "II";
		String actualResult = converter.convert(numberToConvert);

		Assert.assertEquals("The converter could not convert the number properly", expectedResult,
							actualResult);
	}

	@Test
	public void shouldConvertThree() {

		int numberToConvert = 3;
		String expectedResult = "III";
		String actualResult = converter.convert(numberToConvert);

		Assert.assertEquals("The converter could not convert the number properly", expectedResult,
							actualResult);
	}

}
