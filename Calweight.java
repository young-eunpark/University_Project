package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calweight extends JFrame implements ActionListener{
	JButton b;
	JTextField t1,t2;
	JLabel l1,l2,l3,l4,l5;
	public Calweight()
	{
		setSize(300,200);
		setLayout(new BorderLayout());
		setTitle("체중 계산");
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel pg1=new JPanel(new GridLayout(2,3));
		
		l1=new JLabel("키 는? ");
		l2=new JLabel("체중은? ");
		l3=new JLabel("결과 입력");
		l4=new JLabel("cm");
		l5=new JLabel("kg");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b=new JButton("체중 계산");
		b.addActionListener(this);
		t1.setText("1");
		t2.setText("1");
		pg1.add(l1);
		pg1.add(t1);
		pg1.add(l4);
		pg1.add(l2);
		pg1.add(t2);
		pg1.add(l5);
		p3.add(b);
		p4.add(l3);
		add(pg1,BorderLayout.NORTH);
		add(p3,BorderLayout.CENTER);
		add(p4,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int h=Integer.parseInt(t1.getText());
			int w=Integer.parseInt(t2.getText());
			double nw=(h-100)*0.9;
			l3.setOpaque(true);
			if(w>nw)
			{
				l3.setBackground(Color.RED);
				l3.setText("과체중입니다");
			}
			else if(w==nw)
			{
				l3.setBackground(Color.GREEN);
				l3.setText("정상체중입니다");
			}
			else if(w<nw)
			{
				l3.setBackground(Color.YELLOW);
				l3.setText("저체중입니다.");
			}
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Calweight();
	}
}
