package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BoxButton extends JFrame{
	JButton jb=new JButton("test button");
	BoxButton()
	{
		setTitle("ChechBox Practice Frame");
		setLayout(new FlowLayout());
		JCheckBox j1=new JCheckBox("��ư ��Ȱ��ȭ");
		JCheckBox j2=new JCheckBox("��ư ���߱�");

		add(j1);
		add(j2);
		add(jb);
		
		j1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
					jb.setEnabled(false);
				else
					jb.setEnabled(true);
			}
		});
		j2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
					jb.setVisible(false);
				else
					jb.setVisible(true);
			}
		});
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxButton();
	}
}
