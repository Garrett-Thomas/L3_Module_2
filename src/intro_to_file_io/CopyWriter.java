package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CopyWriter {
	static String tard = "";
	public static void main(String[] args) {
		tard = JOptionPane.showInputDialog(null, "Enter .java file to b copywrited");
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/" + tard, true);
			System.out.println(1);
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write("/n\\copywrite");
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
