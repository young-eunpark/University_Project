package w13;

import javax.swing.*;

import w13.ComboBoxTest.MyKey;

import java.awt.*;
import java.awt.event.*;
public class ComboBoxImage extends JFrame{
	JComboBox cbox;
	JTextField tf;
	ImageIcon[] image= {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg"),
			new ImageIcon("images/error.jpg")
	};
	ComboBoxImage(){
		setTitle("콤보박스 2");
		setSize(300,300);
		setLayout(new FlowLayout());
		
		cbox=new JComboBox();
		tf=new JTextField(10);
		JLabel imgLabel=new JLabel();
		tf.addKeyListener(new MyKey());
		cbox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox cb=(JComboBox)e.getSource();
				String item=cb.getSelectedItem().toString();
				if(item.equals("사과")) {
					imgLabel.setIcon(image[0]);
				}
				else if(item.equals("바나나")) {
					imgLabel.setIcon(image[1]);
				}
				else if(item.equals("키위")) {
					imgLabel.setIcon(image[2]);
				}
				else if(item.equals("망고")) {
					imgLabel.setIcon(image[3]);
				}
				else {
					imgLabel.setIcon(image[4]);
				}
			}
		});
		add(tf);
		add(cbox);
		add(imgLabel);
		
		setVisible(true);
		tf.requestFocus();
	}
	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				String t=tf.getText();
				cbox.addItem(t);
			}
		}
	}
	public static void main(String[] args) {
		new ComboBoxImage();
	}

}
