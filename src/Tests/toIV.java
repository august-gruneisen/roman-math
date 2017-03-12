package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class toIV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toIV("IIII");
		assertEquals("IV", output);
	}
}
