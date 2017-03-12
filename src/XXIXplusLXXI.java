import static org.junit.Assert.*;

import org.junit.Test;

public class XXIXplusLXXI {

	@Test
	public void test() {
		Roman_Math test = new Roman_Math();
		String output = test.XXIXplusLXXI();
		assertEquals("C", output);
	}

}
