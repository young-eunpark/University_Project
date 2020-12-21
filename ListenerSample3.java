package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerSample3 extends JFrame{
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener3 listener;
	ListenerSample3()
	{
		setTitle("Action�̺�Ʈ ����Ŭ���� ������ �ۼ�");
		pnl=new JPanel();
		
		btn1=new JButton("��ũ");
		listener=new MyActionListener3();
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2=new JButton("���");
		btn2.addActionListener(listener);
		pnl.add(btn2);
		
		add(pnl);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample3();
	}
	class MyActionListener3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("��ũ"))
				pnl.setBackground(Color.PINK);
			if(b.getText().equals("���"))
				pnl.setBackground(Color.GREEN);
		}
	}
}
