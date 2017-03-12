import static org.junit.Assert.*;

import org.junit.Test;

public class toIIII {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toIIII("IV");
		assertEquals("IIII", output);
	}

}
