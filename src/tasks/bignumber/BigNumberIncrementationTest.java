package tasks.bignumber;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BigNumberIncrementationTest {

	@Test
	public void shouldReturn501incrementing500() throws NegativeDigitException {
		int[] tab = {5, 0, 0};
		int[] res = {5, 0, 1};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test
	public void shouldReturn510incrementing509() throws NegativeDigitException {
		int[] tab = {5, 0, 9};
		int[] res = {5, 1, 0};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test
	public void shouldReturn1000incrementing999() throws NegativeDigitException {
		int[] tab = {9, 9, 9};
		int[] res = {1, 0, 0, 0};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test
	public void shouldReturn10incrementing9() throws NegativeDigitException {
		int[] tab = {9};
		int[] res = {1, 0};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test
	public void shouldReturn10000incrementing9999() throws NegativeDigitException {
		int[] tab = {9, 9, 9, 9};
		int[] res = {1, 0, 0, 0, 0};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test
	public void shouldReturn2000incrementing1999() throws NegativeDigitException {
		int[] tab = {1, 9, 9, 9};
		int[] res = {2, 0, 0, 0};
		tab = new BigNumberIncrementation().increment(tab);
		assertEquals(Arrays.toString(res), Arrays.toString(tab));
	}
	
	@Test  (expected = NegativeDigitException.class)
	public void shouldThrowNegativeDigitExceptionIncrementing200WithNegative() throws NegativeDigitException {
		int[] tab = {-2, 0, 0};
		tab = new BigNumberIncrementation().increment(tab);
	}
	
	@Test  (expected = NegativeDigitException.class)
	public void shouldThrowNegativeDigitExceptionIncrementing2WithNegative() throws NegativeDigitException {
		int[] tab = {-2};
		tab = new BigNumberIncrementation().increment(tab);
	}
	
	@Test (expected = Exception.class)
	public void testDoubleDigitThrowsException() throws NegativeDigitException {
		int[] tab = {3, 1, 11};
		tab = new BigNumberIncrementation().increment(tab);
	}
	
}
