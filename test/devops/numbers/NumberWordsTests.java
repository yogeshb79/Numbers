package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "One", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "Two", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numberTwoHundredFiftyFiveReturnsTwoHundredFiftyFive() {
		Assert.assertEquals( "Two Hundred Fifty Five", "Two Hundred Fifty Five", numberWords.toWords( 255 ) ) ;
	}
	
	@Test
	public void numberNineHundredNinetyNineReturnsNineHundredNinetyNine() {
		Assert.assertEquals( "Nine Hundred Ninety Nine", "Nine Hundred Ninety Nine", numberWords.toWords( 999 ) ) ;
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}

	@Test
	public void numberMoerthan999returnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords(1000 ) ) ;
	}

	
}
