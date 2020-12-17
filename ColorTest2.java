package w09;

import javax.swing.*;
import java.awt.*;
public class ColorTest2 extends JFrame {
	public ColorTest2()
	{
		Frame f=new Frame("Panel Test2");
		Panel p1=new Panel();
		Panel p2=new Panel();
		
		f.setLayout(new GridLayout(2,1));
		p1.setBackground(Color.RED);
		p2.setBackground(Color.YELLOW);
		
		Button b1=new Button("빨간색");
		Button b2=new Button("노란색");
		
		p1.add(b1);
		p2.add(b2);
		
		f.add(p1);
		f.add(p2);
		
		f.setSize(300,800);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ColorTest2();
	}
}

/*public class ColorTest2 extends JFrame {
	public ColorTest2()
	{
		Container c=getContentPane();
		GridLayout g=new GridLayout(1,2);
		
		c.setLayout(g);
		JFrame j=new JFrame();
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		
		j.setSize(300,800);
		j.setTitle("Panel Test2");
		
		j1.setBackground(Color.RED);
		j1.setSize(300,400);
		j2.setBackground(Color.YELLOW);
		j2.setSize(300,400);
		
		j.add(j1);
		j.add(j2);
		j.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new ColorTest2();
	}
}*/