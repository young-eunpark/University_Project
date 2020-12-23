package w13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBoxTest extends JFrame{
	JComboBox cbox;
	JTextField tf;
	ComboBoxTest(){
		setTitle("ÄÞº¸¹Ú½º");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		cbox=new JComboBox();
		tf=new JTextField(10);
		tf.addKeyListener(new MyKey());
		
		add(tf);
		add(cbox);
		
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
		new ComboBoxTest();
	}
}
