package MaruthiSessions;

import java.io.File;
import java.io.IOException;

public class FileConcept {
	
	public static void main(String[] args) throws IOException {
		
//		File f=new File("D:\\", "abc.txt");   //f.isFile();
//		f.createNewFile();
//		
//		File f3=new File("D:\\", "KingKong");   //f.isDirectory();
//		f3.mkdir();
//		
//     	File f1=new File("D:\\KingKong","Godzilla.txt");
//		f1.createNewFile();
//		
//		File f2=new File(f3,"Aramco.txt");
//		f2.createNewFile();
//		
//		File f4=new File("D:\\abc.txt");
//		long filelist=f4.length();
//		System.out.println(filelist);
//		
		
		
		File f5=new File("D:\\");
		String[] hi=f5.list();
		//System.out.println(hi);
		int count=0;
		for(String hi1:hi)
		{
			File f6=new File(f5,hi1);
			if(f6.isFile())
			{
			
		      System.out.println(hi1);
		      count++;
			}
		}
		
	
		
	}

}
