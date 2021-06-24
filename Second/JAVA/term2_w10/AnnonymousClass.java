package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AnnonymousClass extends JFrame {
	AnnonymousClass()
	{
		setTitle("AnnonymousClassTest");
		setLayout(new FlowLayout());
		JButton btn=new JButton("Hello");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("Hello"))
					System.out.println("Click");
				else
					b.setText("Hello");
			}
		});
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AnnonymousClass();
	}
}
