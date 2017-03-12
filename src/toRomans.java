import static org.junit.Assert.*;

import org.junit.Test;

public class toRomans {

	@Test
	public void testI() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("I");
		assertEquals("I", output);
	}
	
	public void testII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("II");
		assertEquals("II", output);
	}
	
	public void testIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("III");
		assertEquals("III", output);
	}
	
	public void testIIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("IIII");
		assertEquals("IV", output);
	}
	
	public void testIIIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("IIIII");
		assertEquals("V", output);
	}
	
	public void testIIIIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("IIIIII");
		assertEquals("VI", output);
	}
	
	public void testIIIIIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("IIIIIII");
		assertEquals("VII", output);
	}
	
	public void testIIIIIIII() {
		Roman_Math test = new Roman_Math();
		String output = test.toRomans("IIIIIIII");
		assertEquals("VIII", output);
	}

}
