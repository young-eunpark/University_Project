package w09;

import javax.swing.*;
import java.awt.*;
public class ColorTest1 {
	public ColorTest1()
	{
		JFrame j=new JFrame();
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		
		j.setSize(400,200);
		j.setTitle("Panel Test");
		
		j1.setBackground(Color.RED);
		j1.setSize(200,200);
		j2.setBackground(Color.GREEN);
		j2.setSize(200,200);
		
		j.add(j1);
		j.add(j2);
		
		j.setVisible(true);
	}
	public static void main(String[] args) {
		new ColorTest1();
	}
}
