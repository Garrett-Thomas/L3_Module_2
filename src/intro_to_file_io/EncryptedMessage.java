package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class EncryptedMessage {
	public static void main(String[] args) {
		String messg = JOptionPane.showInputDialog("Enter message to be encrypted.");
		try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);
		fw.write(Base64.getEncoder().encodeToString(messg.getBytes("utf-8")));
		fw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
