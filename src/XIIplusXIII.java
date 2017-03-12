import static org.junit.Assert.*;

import org.junit.Test;

public class XIIplusXIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XIIplusXIII();
		assertEquals("XXV", output);
	}
}
