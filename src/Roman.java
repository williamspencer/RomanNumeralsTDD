
public class Roman {

public static String intToRoman(int value){
	String roman = "";
	int [] arabicNum = {10,9};
	String [] romanNum = {"X","IX"};
	
	for(int i = 0; i < arabicNum.length; i++){
		while (value >= arabicNum[i]){
			roman += romanNum[i];
			value -= arabicNum[i];
		}
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
