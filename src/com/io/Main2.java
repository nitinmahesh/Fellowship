package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

//BufferedInputStream bis=new BufferedInputStream(fin)
//bis.readLine();
public class Main2 {

	public static void main(String[] args) throws Exception{

		File f=new File("d://abc.txt");
	
		if(f.exists())
		{
			/*FileInputStream fin=new FileInputStream(f);
			 *
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char)fin.read());
			}
			int ch=0;
			while ((ch=fin.read())!=-1) {
				System.out.print((char)ch);
			}*/
			
			FileReader fr=new FileReader(f);
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char)fr.read());
			}
		}
		else
		{
			System.out.println("Not Exist");
		}
	}

}
