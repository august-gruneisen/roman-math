import static org.junit.Assert.*;

import org.junit.Test;

public class toX {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.toX("IIIIIIIIII");
		assertEquals("X", output);
	}

}
