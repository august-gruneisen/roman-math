package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class IIplusII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IIplusII();
		assertEquals("IV", output);
	}

}
