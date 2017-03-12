import static org.junit.Assert.*;

import org.junit.Test;

public class IIplusIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IIplusIII();
		assertEquals("V", output);
	}
	
}
