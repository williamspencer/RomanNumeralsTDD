
public class Roman {

public static String intToRoman(int value){
	String roman = "";
	
	while (value > 0){
		roman += "I";
		value--;
	}
	return roman;
	
//	if (value == 1){
//		return "I";
//	}else if (value == 2){
//		return "II";
//	}else{
//		return "III";
//	}
}
}
