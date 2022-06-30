package controller;
import java.awt.Desktop;  
import java.io.*;  
public class HelpController   {  
	public HelpController(){  
		try  {  

			File file = new File("/Users/dnv/Desktop/oopmini/realproject/src/controller/Help.txt");   
			if(!Desktop.isDesktopSupported())	{  
				System.out.println("not supported");  
				return;
			}  Desktop desktop = Desktop.getDesktop();  
			if(file.exists())         
				desktop.open(file);                
			} catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
}  
}  