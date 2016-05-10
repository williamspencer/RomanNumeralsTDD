
public class Roman {

	public static String intToRoman(int value) {
		String roman = "";
		int[] arabicNum = { 10, 9, 5, 4, 1 };
		String[] romanNum = { "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < arabicNum.length; i++) {
			while (value >= arabicNum[i]) {
				roman += romanNum[i];
				value -= arabicNum[i];
			}
		}
		return roman;
	}
}
