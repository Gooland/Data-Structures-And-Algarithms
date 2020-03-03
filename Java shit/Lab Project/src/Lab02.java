import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Lab02 {

	public static void main(String[] args) 
	{
		Vehicle car = new Vehicle(2, 6, "blue", 14.6, 3);
		Taxi cab = new Taxi(false, 4, 6, "yellow", 3.3, 5);
		Truck mack = new Truck(true, 2, 16, "black", 7.54, 8);
		MonsterTruck gDigger = new MonsterTruck("Grave Digger", 2, 24, "green", 4.2, 10);
		
		
		
		
		System.out.println(car);
		System.out.println(cab);
		System.out.println(mack);
		System.out.println(gDigger);
		printToDoc(car.toString());
	}
	
	public void printToDoc(String in)//assisted by https://www.tutorialspoint.com/apache_poi_word/apache_poi_word_quick_guide.htm 
	{                                // and Coding Tips and Tricks video: "Java - How to read word file using Apache POI"
		XWPFDocument docx = new XWPFDocument();
		try(FileOutputStream fileOut = new FileOutputStream("doc.docx"))
		{
			docx.write(fileOut);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
//docs.google.com/document/d/1AyLpHcTwxUBzjP_rC3FmbIMBYSj_mYhdX9AVZwpQfWE/edit
//https://www.javatpoint.com/apache-poi-creating-ms-word
//https://www.codejava.net/java-se/file-io/java-io-fileinputstream-and-fileoutputstream-examples
