import static org.junit.Assert.*;

import org.junit.Test;

public class IplusII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.IplusII();
		assertEquals("III", output);
	}
}
