import static org.junit.Assert.*;

import org.junit.Test;

public class IIIplusIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IIIplusIII();
		assertEquals("VI", output);
	}
	
}
