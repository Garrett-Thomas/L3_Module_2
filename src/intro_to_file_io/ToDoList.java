package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JLabel label = new JLabel();
	JButton add = new JButton();
	JButton load = new JButton();
	JButton save = new JButton();
	JButton del = new JButton();
	String  task = "";
	static String listName = "";
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.anOriginalMethodName();
		listName = JOptionPane.showInputDialog(null, "Enter desired file name b-low:b ");
	}

	public void anOriginalMethodName() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(add);
		panel.add(load);
		panel.add(save);
		panel.add(del);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setResizable(false);
		add.addActionListener(this);
		load.addActionListener(this);
		save.addActionListener(this);
		del.addActionListener(this);
		add.setText("Add");
		load.setText("Load from file");
		save.setText("Save list");
		del.setText("Delete");
		
	}
	 public void removeLineFromFile(String file, String lineToRemove) {
		 
	        try {
	            File inFile = new File(file);
	            if (!inFile.isFile()) {
	                System.out.println("Parameter is not an existing file");
	                return;
	            }
	            //Construct the new file that will later be renamed to the original filename. 
	            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	            String line ;
	            //Read from the original file and write to the new 
	            //unless content matches data to be removed.
	            while ((line = br.readLine()) != null) {
	                if (!line.trim().equals(lineToRemove)) {
	                    pw.println(line);
	                    pw.flush();
	                }
	            }
	            pw.close();
	            br.close();
	 
	            //Delete the original file
	            if (!inFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	            }
	            //Rename the new file to the filename the original file had.
	            if (!tempFile.renameTo(inFile))
	                System.out.println("Could not rename file");
	 
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(add.equals(e.getSource())) {
			task = JOptionPane.showInputDialog(null, "Enter a task below: ");
					try {
						FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
						
						/*
						NOTE: To append to a file that already exists, add true as a second parameter when calling the
						      FileWriter constructor.
						      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
						*/
						
						fw.write(task + "%n");
							
						fw.close();
					} catch (IOException f) {
						f.printStackTrace();
					}
			
		}
		if(del.equals(e.getSource())){
			String deleteTask = "";
			deleteTask = JOptionPane.showInputDialog(null, "Enter task txt to be deleted: ");
			removeLineFromFile(listName, deleteTask);
		}
		if(load.equals(e.getSource())) {
			JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();
				System.out.println(fileName);
		}
		if(save.equals(e.getSource())) {
			if (JOptionPane.showConfirmDialog(null, "Save list?") == 1 ) {
				
			}
			else {
				
			}
			}
		}
	}
}
