package w13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class NumChange extends JFrame implements ActionListener{
	JTextField src=new JTextField(8);
	JTextField dest=new JTextField(8);
	String[] text= {"10����","2����","8����","16����"};
	JComboBox combo1=new JComboBox(text);
	JComboBox combo2=new JComboBox(text);
	int n, sign=1;
	
	NumChange(){
		setTitle("���� ��ȯ2");
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		dest.setEditable(false);
		combo1.addActionListener(this);
		combo2.addActionListener(this);
		
		c.add(combo1);
		c.add(new JLabel("        ==>"));
		c.add(combo2);
		c.add(src);
		c.add(new JLabel(" "));
		c.add(dest);
		
		setSize(400,150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s1=null, s2=null;
		if(e.getSource()==combo1) {
			s1=combo1.getSelectedItem().toString();
			try {
				switch(s1) {
					case "10����":
						n=Integer.parseInt(src.getText());
						break;
					case "2����":
						n=Integer.parseInt(src.getText(),2);
						break;
					case "8����":
						n=Integer.parseInt(src.getText(),8);
						break;
					case "16����":
						n=Integer.parseInt(src.getText(),16);
						break;
				}
			}catch(NumberFormatException exp) {
				src.setText("error");	
			}
			System.out.println(n);
			if(n<0) {
				sign=-1;
				n*=sign;
			}
		}
		if(e.getSource()==combo2) {
			s2=combo2.getSelectedItem().toString();
			try {
				switch(s2) {
					case "10����":
						if(sign<0) dest.setText("-"+Integer.toString(n));
						else dest.setText(Integer.toString(n));
						break;
					case "2����":
						if(sign<0) dest.setText("-"+Integer.toBinaryString(n));
						else dest.setText(Integer.toBinaryString(n));
						break;
					case "8����":
						if(sign<0) dest.setText("-"+Integer.toOctalString(n));
						else dest.setText(Integer.toOctalString(n));
						break;
					case "16����":
						if(sign<0) dest.setText("-"+Integer.toHexString(n));
						else dest.setText(Integer.toHexString(n));
						break;
				}
			}catch(NumberFormatException exp) {
				src.setText("error");	
			}
		}
	}
	public static void main(String[] args) {
		new NumChange();
	}
}
