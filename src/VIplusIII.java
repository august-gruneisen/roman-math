import static org.junit.Assert.*;

import org.junit.Test;

public class VIplusIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.VIplusIII();
		assertEquals("IX", output);
	}

}
