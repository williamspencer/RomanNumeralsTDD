
public class Roman {

public static String intToRoman(int value){
	String roman = "";
	int [] arabicNum = {10};
	String [] romanNum = {"X"};
	
	for(int i = 0; i < arabicNum.length; i++){
		while (value >= arabicNum[i]){
			roman += romanNum[i];
			value -= arabicNum[i];
		}
	}

	if (value == 9){
		roman = "IX";
		value -= 9;
	}
	if (value >= 5){
		roman = "V";
		value -= 5;
	}
	if (value == 4){
		roman = "IV";
		value -= 4;
	}
	while (value > 0){
		roman += "I";
		value--;
	}
	return roman;

}
}
