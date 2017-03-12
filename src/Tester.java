import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.tester();
		assertEquals("II", output);
	}
}
