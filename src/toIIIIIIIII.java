import static org.junit.Assert.*;

import org.junit.Test;

public class toIIIIIIIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toIIIIIIIII("IX");
		assertEquals("IIIIIIIII", output);
	}

}
