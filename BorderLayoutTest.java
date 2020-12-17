package w09;

import javax.swing.*;
import java.awt.*;

class LayoutTest extends JFrame
{
	public LayoutTest()
	{
		Container c=getContentPane();
		BorderLayout b=new BorderLayout(7,5);
		c.setLayout(b);
		c.add(new JButton("������"),BorderLayout.EAST);
		c.add(new JButton("�� ��"),BorderLayout.WEST);
		c.add(new JButton("�� ��"),BorderLayout.NORTH);
		c.add(new JButton("�� ��"),BorderLayout.SOUTH);
		c.add(new JButton("�� ��"),BorderLayout.CENTER);
		
		setName("BorderLayout Pratice");
		setSize(400,200);
		setVisible(true);
	}
}
public class BorderLayoutTest {
	public static void main(String[] args) {	
		new LayoutTest();
	}
}
