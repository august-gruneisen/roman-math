import static org.junit.Assert.*;

import org.junit.Test;

public class IIIplusIV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IIIplusIV();
		assertEquals("VII", output);
	}

}
