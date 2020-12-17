package w09;

import javax.swing.*;
import java.awt.*;
class GridTest extends JFrame
{
	public GridTest()
	{
		setTitle("Ten Button Frame");
		GridLayout g=new GridLayout(1,10);
		
		setLayout(g);
		g.setHgap(5);
		JButton[] b=new JButton[10];
		Color[] c= {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,
				Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton(Integer.toString(i));
			b[i].setBackground(c[i]);
			add(b[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
}
public class GridLayoutTest {
	public static void main(String[] args) {
		new GridTest();
	}
}

















/*import javax.swing.*;
import java.awt.*;
class GridTest extends JFrame
{
	public GridTest()
	{
		setTitle("Ten Button Frame");
		GridLayout g=new GridLayout(1,10);
		
		setLayout(g);
		g.setHgap(5);
		JButton[] b=new JButton[10];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton(Integer.toString(i));
			add(b[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
}
public class GridLayoutTest {
	public static void main(String[] args) {
		new GridTest();
	}
}*/