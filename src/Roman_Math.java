import javax.swing.JOptionPane;

/* Roman_Math adds two Roman numerals together and displays the result as a Roman numeral.
 * No integers were used to write this program.
 */

public class Roman_Math {
	public static void main(String args []) {
		JOptionPane.showMessageDialog(null, "another");
	}
	
	public String tester() {
		String i = new String("II");
		return i;
	}
	
	public String IplusI() {
		String first = "I";
		String second = "I";
		
		String sum = (first + second);
		
		String result = new String(sum);
		return result;
	}
	
	public String IplusII() {
		String first = "I";
		String second = "II";
		
		String sum = (first + second);

		String result = new String(sum);
		return result;
	}
	
	public String IIplusII() {
		String first = "II";
		String second = "II";
		
		String sum = (first + second);
		
		String result = toIV(sum);
		return result;
	}
	
	public String toIV(String number) {
		String output = number;
		if (output.equals("IIII")) {
			output = "IV";
		}
		return output;
	}
	
	public String IIplusIII() {
		String first = "II";
		String second = "III";
		
		String sum = (first + second);
		
		String result = toV(sum);
		return result;
	}
	
	public String toV(String number) {
		String output = number;
		if (output.equals("IIIII")) {
			output = "V";
		}
		return output;
	}
	
	public String IIIplusIII() {
		String first = "III";
		String second = "III";
		
		String sum = (first + second);
		
		String result = sum.replace("IIIII", "V");
		
		return result;
	}
	
	public String IVplusIII() {
		String first = "IV";
		String second = "III";
		
		first = toIIII(first);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toIIII(String number) {
		String output = number;
		if (output.equals("IV")) {
			output = "IIII";
		}
		return output;
	}
	
	public String IIIplusIV() {
		String first = "III";
		String second = "IV";
		
		second = toIIII(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toRomans(String number) {
		String output = number;
		output = toIV(output);
		output = toV(output);
		output = toIX(output);
		output = toX(output);
		
		output = output.replace("IIIII", "V");
		
		return output;
	}

	public String IIIplusV() {
		String first = "III";
		String second = "V";
		
		second = toIIIII(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toIIIII(String number) {
		String output = number;
		if (output.equals("V")) {
			output = "IIIII";
		}
		return output;
	}

	public String IVplusIV() {
		String first = "IV";
		String second = "IV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String toIs(String number) {
		String output = number;
		output = toIIII(output);
		output = toIIIII(output);
		output = output.replace("V", "IIIII");
		
		return output;
	}

	public String VIplusIII() {
		String first = "VI";
		String second = "III";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toIX(String number) {
		String output = number;
		if (output.equals("IIIIIIIII")) {
			output = "IX";
		}
		return output;
	}

	public String VIIplusII() {
		String first = "VII";
		String second = "II";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String VplusIV() {
		String first = "V";
		String second = "IV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String VplusV() {
		String first = "V";
		String second = "V";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String toX(String number) {
		String output = number;
		if (output.equals("IIIIIIIIII")) {
			output = "X";
		}
		return output;
	}

	public String VIplusIV() {
		String first = "VI";
		String second = "IV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String IIplusVIII() {
		String first = "II";
		String second = "VIII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
}

