package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class ReadEncryptedMessage {
	public static void main(String[] args) {
		String ecrypt = JOptionPane.showInputDialog("Enter file name to be decrypted: ");
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/" + ecrypt));
			String line = br.readLine();
			while(line != null){
				byte[]	lineBytes = Base64.getDecoder().decode(line);
				System.out.println(new String(lineBytes));
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
