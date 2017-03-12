import static org.junit.Assert.*;

import org.junit.Test;

public class toIs {

	@Test
	public void testI() {
		Roman_Math test = new Roman_Math();
		String output = test.toIs("I");
		assertEquals("I", output);
	}

	public void testII() {
		Roman_Math test = new Roman_Math();
		String output = test.toIs("II");
		assertEquals("II", output);
	}

	public void testIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toIs("III");
		assertEquals("III", output);
	}

	public void testIV() {
		Roman_Math test = new Roman_Math();
		String output = test.toIs("IV");
		assertEquals("IIII", output);
	}

	public void testV() {
		Roman_Math test = new Roman_Math();
		String output = test.toIs("V");
		assertEquals("IIIII", output);
	}

}
