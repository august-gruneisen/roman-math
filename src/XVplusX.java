import static org.junit.Assert.*;

import org.junit.Test;

public class XVplusX {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XVplusX();
		assertEquals("XXV", output);
	}

}
