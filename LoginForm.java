package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame{
	JTextField login = new JTextField(10);
	JTextField password = new JTextField(10);
	JLabel login2=new JLabel("ID �Է� : ");
	JLabel password2=new JLabel("��й�ȣ �Է� : ");
	JButton button=new JButton("�α���");
	LoginForm(){
		setTitle("�α��� â");
		setContentPane(new Form());
		setSize(300,150);
		setVisible(true);
	}
	class Form extends JPanel{
		Form(){
			setLayout(new GridLayout(2,1));
			
			JPanel p1=new JPanel();
			p1.setLayout(new GridLayout(2,2));
			p1.add(login2);
			p1.add(login);
			p1.add(password2);
			p1.add(password);
		
			JPanel p2=new JPanel();
			p2.add(button);
			
			add(p1);
			add(p2);
		}
	}
	public static void main(String[] args) {
		new LoginForm();
	}
}
