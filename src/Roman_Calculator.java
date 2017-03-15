/* Uses the Roman_Math class */

public class Roman_Calculator {
	
	public static String addRomans(String firstRoman, String secondRoman) {
		String first = firstRoman;
		String second = secondRoman;
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);
		
		String sum = (first + second);
		
		String result = Roman_Math.toRomans(sum);
		
		if (result.equals("")) {
			result = "nulla";
		}
		
		return result;
	}
	
	public static String subtractRomans(String firstRoman, String secondRoman) {
		
		String first = firstRoman;
		String second = secondRoman;
		String difference;
		
		first = Roman_Math.toIs(first);
		second = Roman_Math.toIs(second);
		
		difference = first.replaceFirst(second, "");
		
		if (second.equals("")) {
			difference = first;
		} else if (difference.equals(first)) {
			difference = second.replaceFirst(first, "");
			if (!difference.equals("")) {
				difference = ("-" + difference);
			}
		}
				
		String result = Roman_Math.toRomans(difference);
		
		if (result.equals("")) {
			result = "nulla";
		}
		
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
		
		if (result.equals("")) {
			result = "nulla";
		}
		
		return result;
	}
	
	public static String divideRomans(String firstRoman, String secondRoman) {
		String first = firstRoman;
		String second = secondRoman;
		String quotient = "";
		String remainder = first;
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