package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements MouseListener, ActionListener {
	JButton add = new JButton();
	JButton load = new JButton();
	JButton save = new JButton();
	JButton del = new JButton();
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.anOriginalMethodName();
	}

	public void anOriginalMethodName() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(add.equals(e.getSource())) {
			
		}
	}
}
