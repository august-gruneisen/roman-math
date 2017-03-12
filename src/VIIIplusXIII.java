import static org.junit.Assert.*;

import org.junit.Test;

public class VIIIplusXIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.VIIIplusXIII();
		assertEquals("XXI", output);
	}

}
