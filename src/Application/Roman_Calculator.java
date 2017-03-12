package Application;

public class Roman_Calculator {
	
	public static String addRomans(String firstRoman, String secondRoman) {
		String first = firstRoman;
		String second = secondRoman;
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);
		
		String sum = (first + second);
		
		String result = Roman_Math.toRomans(sum);
		
		return result;
	}
	
	public static String subtractRomans(String firstRoman, String secondRoman) {
		// need to write function for subtracting Roman numerals
		return "This function is not written yet";
	}
}