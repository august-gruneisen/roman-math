import static org.junit.Assert.*;

import org.junit.Test;

public class XIplusV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XIplusV();
		assertEquals("XVI", output);
	}

}
