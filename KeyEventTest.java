package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyEventTest extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel jl=new JLabel("Ű�� �Է��ϼ���");
	KeyEventTest()
	{
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(jl);
		setSize(200,200);
		setVisible(true);
		contentPane.requestFocus();
	}
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.isAltDown()==true)
			{
				System.out.println("AltŰ�� ���Ƚ��ϴ�.");
			}
		}
	}
	public static void main(String[] args)
	{
		new KeyEventTest();
	}
}
