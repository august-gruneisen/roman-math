import static org.junit.Assert.*;

import org.junit.Test;

public class XXIVplusXXVI {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XXIVplusXXVI();
		assertEquals("L", output);
	}

}
