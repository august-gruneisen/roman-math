import static org.junit.Assert.*;

import org.junit.Test;

public class VIIIplusX {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.VIIIplusX();
		assertEquals("XVIII", output);
	}

}
