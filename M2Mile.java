package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class M2Mile extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JTextField t1,t2;
	public M2Mile()
	{
		setSize(400,200);
		setLayout(new BorderLayout());
		setTitle("마일<->미터로 변환");
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel pg1=new JPanel();
		JPanel pg2=new JPanel();
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		JLabel label1=new JLabel("거리를 입력하시오");
		JLabel label2=new JLabel("마일->미터로 변환");
		JLabel label3=new JLabel("미터->마일로 변환");
		t1=new JTextField(5);
		t2=new JTextField(25);
		t2.setEditable(false);
		b1=new JButton("변환1");
		b2=new JButton("변환2");
		b3=new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1.setText("1");
		t2.setEditable(false);
		p1.add(label1);
		p1.add(t1);
		p2.add(label2);
		p2.add(b1);
		p3.add(label3);
		p3.add(b2);
		p4.add(t2);
		p4.add(b3);
		JPanel p=new JPanel(new BorderLayout());
		p.add(p2,BorderLayout.NORTH);
		p.add(p3,BorderLayout.SOUTH);
		add(p1,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		add(p4,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int t=Integer.parseInt(t1.getText());
			double m=t*1609344;
			int m1=(int)(m*0.001);
			t2.setText(t+"마일은 "+m1+" 미터입니다.");
		}
		else if(e.getSource()==b2)
		{
			int t=Integer.parseInt(t1.getText());
			double mi=(double)t/1609344;
			double m1=(double)(mi*1000);
			t2.setText(t+"미터는 "+m1+" 마일입니다.");
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new M2Mile();
	}
}
