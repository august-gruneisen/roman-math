/* Uses the Roman_Math class */

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
		
		String first = firstRoman;
		String second = secondRoman;
		String difference;
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);

		if (first.length() < second.length()) {
			difference = second.replaceFirst(first, "");
			difference = ("-" + difference);
		} else {
			difference = first.replaceFirst(second, "");
		}
		
		String result = Roman_Math.toRomans(difference);
		
		return result;
	}
}