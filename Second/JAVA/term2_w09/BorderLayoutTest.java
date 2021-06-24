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
		c.add(new JButton("오른쪽"),BorderLayout.EAST);
		c.add(new JButton("왼 쪽"),BorderLayout.WEST);
		c.add(new JButton("북 쪽"),BorderLayout.NORTH);
		c.add(new JButton("남 쪽"),BorderLayout.SOUTH);
		c.add(new JButton("중 앙"),BorderLayout.CENTER);
		
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
