import static org.junit.Assert.*;

import org.junit.Test;

public class IIIplusV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IIIplusV();
		assertEquals("VIII", output);
	}

}
