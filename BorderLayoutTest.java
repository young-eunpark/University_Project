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
		c.add(new JButton("坷弗率"),BorderLayout.EAST);
		c.add(new JButton("哭 率"),BorderLayout.WEST);
		c.add(new JButton("合 率"),BorderLayout.NORTH);
		c.add(new JButton("巢 率"),BorderLayout.SOUTH);
		c.add(new JButton("吝 居"),BorderLayout.CENTER);
		
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
