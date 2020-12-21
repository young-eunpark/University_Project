package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerSample2 extends JFrame{
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener2 listener;
	ListenerSample2()
	{
		setTitle("Action이벤트 외부클래스 리스너 작성");
		pnl=new JPanel();
		
		btn1=new JButton("핑크");
		listener=new MyActionListener2(pnl);
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2=new JButton("녹색");
		btn2.addActionListener(listener);
		pnl.add(btn2);
		
		add(pnl);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample2();
	}
}
class MyActionListener2 implements ActionListener
{
	JPanel jp;
	public MyActionListener2(JPanel pnl)
	{
		jp=pnl;
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("핑크"))
			jp.setBackground(Color.PINK);
		if(b.getText().equals("녹색"))
			jp.setBackground(Color.GREEN);
	}
}