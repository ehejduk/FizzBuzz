package pl.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzBuzz {

	@Test
	public void testPrintNumbers1To100() {
		FizzBuzz testNumbers = new FizzBuzz();
		String testOutput = testNumbers.printNumbers();

		String testExpected = "";
		for (int i = 1; i <= 100; i++) {
			testExpected += i;
			testExpected += "\n";
		}

		assertEquals(testExpected, testOutput);
	}

	@Test
	public void testPrintFizz() {
		FizzBuzz testNumbers = new FizzBuzz();
		String testOutput = testNumbers.printNumbers();

		String testExpected = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				testExpected += "Fizz";
				testExpected += "\n";
			} else {

				testExpected += i;
				testExpected += "\n";
			}
		}

		assertEquals(testExpected, testOutput);
	}

	@Test
	public void testPrintBuzz() {
		FizzBuzz testNumbers = new FizzBuzz();
		String testOutput = testNumbers.printNumbers();

		String testExpected = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				testExpected += "Fizz";
				testExpected += "\n";
			} else if (i % 5 == 0) {
				testExpected += "Buzz";
				testExpected += "\n";
			} else {

				testExpected += i;
				testExpected += "\n";
			}
		}

		assertEquals(testExpected, testOutput);
	}

	@Test
	public void testPrintFizBuzzFinalTest() {
		FizzBuzz testNumbers = new FizzBuzz();
		String testOutput = testNumbers.printNumbers();

		String testExpected = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					testExpected += "FizzBuzz";
					testExpected += "\n";
				} else {
					testExpected += "Fizz";
					testExpected += "\n";
				}
			} else if (i % 5 == 0) {
				testExpected += "Buzz";
				testExpected += "\n";
			} else {

				testExpected += i;
				testExpected += "\n";
			}
		}

		assertEquals(testExpected, testOutput);
	}

}
