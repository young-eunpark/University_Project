package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculation extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3;
	public Calculation()
	{
		setSize(400,200);
		setLayout(new BorderLayout());
		setTitle("Calculator");
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel pg=new JPanel();
		
		pg.setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("첫번째 수 : ");
		JLabel label2=new JLabel("두번째 수 : ");
		JLabel label3=new JLabel("연산식 : ");
		JLabel label4=new JLabel("수식 결과 : ");
		t1=new JTextField(5);
		t2=new JTextField(5);
		t3=new JTextField(25);
		t3.setEditable(false);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		t1.setText("1");
		t2.setText("1");
		t3.setEditable(false);
		p1.add(label1);
		p1.add(t1);
		p2.add(label2);
		p2.add(t2);
		p3.add(label3);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p4.add(label4);
		p4.add(t3);
		JPanel p=new JPanel(new BorderLayout());
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.SOUTH);
		add(p,BorderLayout.NORTH);
		add(p3,BorderLayout.CENTER);
		add(p4,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int sum;
			int i1=Integer.parseInt(t1.getText());
			int i2=Integer.parseInt(t2.getText());
			sum=i1+i2;
			t3.setText(i1+" + "+i2+" = "+sum);
		}
		else if(e.getSource()==b2)
		{
			int sub;
			int i1=Integer.parseInt(t1.getText());
			int i2=Integer.parseInt(t2.getText());
			sub=i1-i2;
			t3.setText(i1+" - "+i2+" = "+sub);
		}
		else if(e.getSource()==b3)
		{
			int mul;
			int i1=Integer.parseInt(t1.getText());
			int i2=Integer.parseInt(t2.getText());
			mul=i1*i2;
			t3.setText(i1+" * "+i2+" = "+mul);
		}
		else if(e.getSource()==b4)
		{
			int div;
			int i1=Integer.parseInt(t1.getText());
			int i2=Integer.parseInt(t2.getText());
			div=i1/i2;
			t3.setText(i1+" / "+i2+" = "+div);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Calculation();
	}
}
