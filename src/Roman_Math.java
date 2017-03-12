import javax.swing.JOptionPane;

/* Roman_Math adds two Roman numerals together and displays the result as a Roman numeral.
 * No integers were used to write this program.
 */

public class Roman_Math {
	public static void main(String args []) {
		JOptionPane.showMessageDialog(null, "running");
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
		output = output.replace("IIIII", "V");
		output = output.replace("VV", "X");
		output = output.replace("XXXXX", "L");
		output = output.replace("LL", "C");
		output = output.replace("CCCCC", "D");
		output = output.replace("DD", "M");
		output = output.replace("DCCCC", "CM");
		output = output.replace("CCCC", "CD");
		output = output.replace("LXXXX", "XC");
		output = output.replace("XXXX", "XL");
		output = output.replace("VIIII", "IX");
		output = output.replace("IIII", "IV");
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
		output = output.replace("IV", "IIII");
		output = output.replace("IX", "VIIII");
		output = output.replace("XL", "XXXX");
		output = output.replace("XC", "LXXXX");
		output = output.replace("CD", "CCCC");
		output = output.replace("CM", "DCCCC");
		output = output.replace("M", "DD");
		output = output.replace("D", "CCCCC");
		output = output.replace("C", "LL");
		output = output.replace("L", "XXXXX");
		output = output.replace("X", "VV");
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

	public String VplusVI() {
		String first = "V";
		String second = "VI";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String VIIIplusVI() {
		String first = "VIII";
		String second = "VI";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String VIIIplusVIII() {
		String first = "VIII";
		String second = "VIII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String IXplusI() {
		String first = "IX";
		String second = "I";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toIIIIIIIII(String number) {
		String output = number;
		if (output.equals("IX")) {
			output = "IIIIIIIII";
		}
		return output;
	}
	
	public String VIIIplusX() {
		String first = "VIII";
		String second = "X";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String toIIIIIIIIII(String number) {
		String output = number;
		if (output.equals("X")) {
			output = "IIIIIIIIII";
		}
		return output;
	}

	public String XplusIX() {
		String first = "X";
		String second = "IX";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XplusX() {
		String first = "X";
		String second = "X";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XIplusIV() {
		String first = "XI";
		String second = "IV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XIplusV() {
		String first = "XI";
		String second = "V";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String VIIIplusXIII() {
		String first = "VIII";
		String second = "XIII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XIIIplusIX() {
		String first = "XIII";
		String second = "IX";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XIplusXIII() {
		String first = "XI";
		String second = "XIII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XIIplusXIII() {
		String first = "XII";
		String second = "XIII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XVplusX() {
		String first = "XV";
		String second = "X";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XVplusXV() {
		String first = "XV";
		String second = "XV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XXplusI() {
		String first = "XX";
		String second = "I";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

	public String XXIplusIV() {
		String first = "XXI";
		String second = "IV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XXIVplusXXVI() {
		String first = "XXIV";
		String second = "XXVI";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XXIplusXIX() {
		String first = "XXI";
		String second = "XIX";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XXXplusXIV() {
		String first = "XXX";
		String second = "XIV";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XLIVplusLII() {
		String first = "XLIV";
		String second = "LII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String XXIXplusLXXI() {
		String first = "XXIX";
		String second = "LXXI";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}
	
	public String DCCLIIIplusMCXLVII() {
		String first = "DCCLIII";
		String second = "MCXLVII";
		
		first = toIs(first);
		second = toIs(second);
		
		String sum = (first + second);
		
		String result = toRomans(sum);
		
		return result;
	}

}
















