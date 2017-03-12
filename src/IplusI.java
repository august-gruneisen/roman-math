import static org.junit.Assert.*;

import org.junit.Test;

public class IplusI {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IplusI();
		assertEquals("II", output);
	}
}
