import static org.junit.Assert.*;

import org.junit.Test;

public class VIIIplusVIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.VIIIplusVIII();
		assertEquals("XVI", output);
	}

}
