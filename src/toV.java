import static org.junit.Assert.*;

import org.junit.Test;

public class toV {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toV("IIIII");
		assertEquals("V", output);
	}

}
