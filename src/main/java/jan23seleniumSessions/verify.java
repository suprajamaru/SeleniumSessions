package jan23seleniumSessions;

public class verify {
public static boolean equalValues(String actresult,String expresult) {
	if(actresult.equals(expresult)) {
		System.out.println(actresult+"is equal to"+" "+expresult);
		return true;
	}
	return false;
}
public static boolean containsValues(String actresult,String expresult) {
	if(actresult.contains(expresult)) {
		System.out.println(actresult+"is eaqualto"+" "+expresult);
		return true;
	}
	return false;
}
}
