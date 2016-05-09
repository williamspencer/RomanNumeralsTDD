
public class Roman {

public static String intToRoman(int value){
	String roman = "";
	
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
