
public class Roman {

	public static String intToRoman(int value) {
		String roman = "";
		int[] arabicNum = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romanNum = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};

		for (int i = 0; i < arabicNum.length; i++) {
			while (value >= arabicNum[i]) {
				roman += romanNum[i];
				value -= arabicNum[i];
			}
		}
		return roman;
	}
}
