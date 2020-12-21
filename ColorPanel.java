package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorPanel extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4;
	JTextField tf;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel(new GridLayout(1,4));
	JPanel p3=new JPanel();
	ColorPanel()
	{
		setTitle("ActionEvent Test2");
		setLayout(new GridLayout(3,1));
		setSize(500,300);
		
		tf=new JTextField(30);
		
		b1=new JButton("빨강");
		b1.setBackground(Color.RED);
		b1.addActionListener(this);
		
		b2=new JButton("초록");
		b2.setBackground(Color.GREEN);
		b2.addActionListener(this);
		
		b3=new JButton("노랑");
		b3.setBackground(Color.YELLOW);
		b3.addActionListener(this);
		
		b4=new JButton("종료");
		b4.setBackground(Color.CYAN);
		b4.addActionListener(this);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(tf);
		
		p1.setSize(500,100);
		p2.setSize(500,100);
		p3.setSize(500,100);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1) {
			p1.setBackground(Color.RED);
			tf.setText("빨강이 선택되었습니다");
		}
		else if(e.getSource()==b2) {
			p1.setBackground(Color.GREEN);
			tf.setText("초록이 선택되었습니다");
		}
		else if(e.getSource()==b3) {
			p1.setBackground(Color.YELLOW);
			tf.setText("노랑이 선택되었습니다");
		}
		else if(e.getSource()==b4)
			System.exit(0);
	}
	public static void main(String[] args) {
		new ColorPanel();
	}
}
