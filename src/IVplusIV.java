import static org.junit.Assert.*;

import org.junit.Test;

public class IVplusIV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IVplusIV();
		assertEquals("VIII", output);
	}

}
