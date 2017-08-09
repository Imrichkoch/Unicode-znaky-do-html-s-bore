package html;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;




public class HtmlDemo {
	
	
	public static void symbolsforCards(){
		
		System.out.println("Symbols for building cards: ");
		for(int i = 9484 ;i<9577; i++){
			System.out.println( i +"--------" +((char)i));
		}
	}
	public static String unicodeGenerator(){
		String str = new String("");
		StringBuffer unicodeString = new StringBuffer(); // v cykle sa postupne pridaval unicode, tak trebalo pouzit triedu pre string buffer
		
		
		for(int i = 32;i <= 65535; i++ ){
			 
			 
			 unicodeString.append("<h3>" + i +"--------" +((char)i)+  "</h3>");
		}
		str = unicodeString.toString(); 
		return str;
	}
	public static void main(String[] args) {
		FileWriter bw = null;
		symbolsforCards();
		 
		try {
			bw = new FileWriter("unicode.html");
			BufferedWriter fw = new BufferedWriter(bw);
			fw.write("<!DOCTYPE html> <html> <body>  ");
			fw.write("<h1>UNICODE</h1>");
			fw.write(unicodeGenerator()); // funkcia mi vrati unicode upraveny o html tagy vo forme stringu
			fw.write("</body> </html> ");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
