package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class toIX {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toIX("IIIIIIIII");
		assertEquals("IX", output);
	}

}
