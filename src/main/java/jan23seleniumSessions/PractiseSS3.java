package jan23seleniumSessions;

public class PractiseSS3 {
	
	
	public static void main(String[] args) {
		
		
		String name="hey boys let's enjoy the party";
		String rev=""; char ch;
		System.out.println(name.length());
		System.out.println(name.charAt(0));
	for(int i=0; i<name.length(); i++)
		{
		    ch=name.charAt(i);
		    rev=ch+rev;
		}
		System.out.println(rev);
		
		
	}

}
