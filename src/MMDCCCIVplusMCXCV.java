import static org.junit.Assert.*;

import org.junit.Test;

public class MMDCCCIVplusMCXCV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.MMDCCCIVplusMCXCV();
		assertEquals("MMMCMXCIX", output);
	}

}
