package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class VplusV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.VplusV();
		assertEquals("X", output);
	}

}
