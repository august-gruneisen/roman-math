import static org.junit.Assert.*;

import org.junit.Test;

public class IXplusI {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IXplusI();
		assertEquals("X", output);
	}

}
