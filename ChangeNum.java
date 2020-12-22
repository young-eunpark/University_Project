package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChangeNum extends JFrame{
	JTextField tf1=new JTextField(10);
	JTextField tf2=new JTextField(10);
	JRadioButton[] rb=new JRadioButton[4];
	String[] text= {"10����","2����","8����","16����"};
	ChangeNum(){
		setTitle("���� ��ȯ");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup group=new ButtonGroup();
		MyItemListener listener=new MyItemListener();
		tf2.setEditable(false);
		
		c.add(tf1);
		c.add(new JLabel(" == > "));
		c.add(tf2);
		
		for(int i=0;i<rb.length;i++) {
			rb[i]=new JRadioButton(text[i]);
			rb[i].addItemListener(listener);
			c.add(rb[i]);
			group.add(rb[i]);
		}
		
		setSize(300,150);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED)
				return;
			int n;
			String txt=((JRadioButton)e.getItem()).getText();
			try {
				switch(txt) {
				case "10����":
					n=Integer.parseInt(tf1.getText());
					tf2.setText(Integer.toString(n));
					break;
				case "2����":
					n=Integer.parseInt(tf1.getText());
					tf2.setText(Integer.toBinaryString(n));
					break;
				case "8����":
					n=Integer.parseInt(tf1.getText());
					tf2.setText(Integer.toOctalString(n));
					break;
				case "16����":
					n=Integer.parseInt(tf1.getText());
					tf2.setText(Integer.toHexString(n));
					break;
				}
			}
			finally{}
		}
	}
	public static void main(String[] args) {
		new ChangeNum();
	}
}
