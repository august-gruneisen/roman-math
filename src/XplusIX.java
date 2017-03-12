import static org.junit.Assert.*;

import org.junit.Test;

public class XplusIX {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XplusIX();
		assertEquals("XIX", output);
	}

}
