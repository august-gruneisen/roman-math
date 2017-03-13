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
	
	public static String multiplyRomans(String firstRoman, String secondRoman) {
		String first = firstRoman;
		String second = secondRoman;
		String product = "";
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);
		
		for (String counter = first; !counter.equals(""); counter = counter.replaceFirst("I", "")) {
			product = product + second;
		}
				
		String result = Roman_Math.toRomans(product);
		
		return result;
	}
	
	public static String divideRomans(String firstRoman, String secondRoman) {
		String first = firstRoman;
		String second = secondRoman;
		String quotient = "";
		String remainder = second;
		String result = "";
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);
		
		for (first.length(); (first.length() >= second.length()); first = first.replaceFirst(second, "")) {
			remainder = first.replaceFirst(second, "");
			quotient = quotient + "I";
		}
		
		if (remainder.equals("")) {
			result = Roman_Math.toRomans(quotient);
		} else {
			result = Roman_Math.toRomans(quotient + " remainder " + remainder);
		}
		
		return result;
	}
}