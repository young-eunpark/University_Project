package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerSample5 extends JFrame{
	JButton btn1,btn2;
	JPanel pnl;
	JLabel lbl;
	ListenerSample5()
	{
		setTitle("Action �̺�Ʈ ���� Ŭ���� ó��");
		
		pnl=new JPanel();
		
		btn1=new JButton("��ũ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("��ũ"))
					pnl.setBackground(Color.PINK);
			}
		});
		pnl.add(btn1);
		
		btn2=new JButton("���");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("���"))
					pnl.setBackground(Color.GREEN);
			}
		});
		pnl.add(btn2);
		
		add(pnl);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample5();
	}
}
