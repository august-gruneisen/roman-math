import static org.junit.Assert.*;

import org.junit.Test;

public class toIIIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toIIIII("V");
		assertEquals("IIIII", output);
	}

}
