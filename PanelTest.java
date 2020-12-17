package w09;

import javax.swing.*;
import java.awt.*;
class Panel1 extends Panel
{
	public Panel1()
	{
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(3,1));
		add(new Button("Open")); add(new Button("Read"));
		add(new Button("Close"));
	}
}
class Panel2 extends Panel
{
	public Panel2()
	{
		Label a=new Label("Java",Label.CENTER);
		setLayout(new BorderLayout());
		add(a,BorderLayout.CENTER);
	}
}
public class PanelTest extends Frame{
	public PanelTest()
	{
		super("실습 예제");
		setLayout(new GridLayout(1,2));
		add(new Panel1());
		add(new Panel2());
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PanelTest();
	}
}
