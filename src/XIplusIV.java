import static org.junit.Assert.*;

import org.junit.Test;

public class XIplusIV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XIplusIV();
		assertEquals("XV", output);
	}


}
