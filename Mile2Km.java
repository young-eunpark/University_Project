package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mile2Km extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1;
	JTextField t2;
	public Mile2Km()
	{
		setSize(300,200);
		setLayout(new BorderLayout());
		setTitle("마일을 킬로미터로 변환");
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel pg=new JPanel();
		
		pg.setLayout(new BorderLayout());
		
		JLabel label=new JLabel("거리를 마일 단위로 입력하시오");
		t1=new JTextField(5);
		t2=new JTextField(25);
		t2.setEditable(false);
		b1=new JButton("변환");
		b2=new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.setText("1");
		t2.setEditable(false);
		p1.add(label);
		p1.add(t1);
		p2.add(b1);
		p2.add(b2);
		p3.add(t2);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int t=Integer.parseInt(t1.getText());
			double k=t*1.609344;
			int k1=(int)(k*100);
			double k2=k1/100.0;
			t2.setText(t+"마일은 "+k2+" 킬로미터입니다.");
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		new Mile2Km();
	}
}
