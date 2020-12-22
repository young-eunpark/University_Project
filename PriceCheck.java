package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PriceCheck extends JFrame implements ItemListener{
	JCheckBox[] cbox=new JCheckBox[4];
	String[] change={"�������� ��ȯ","�ڵ����ӱ� ���� ��ȯ","������ ���� ��ȯ","Ÿ�̾� ��ȯ"};
	int[] price= {45000,80000,30000,100000};
	int money=0;
	JLabel lbl;
	JPanel pnl;
	PriceCheck(){
		setLayout(new BorderLayout());
		setSize(500,200);
		pnl=new JPanel();
		
		for(int i=0;i<4;i++) {
			cbox[i]=new JCheckBox(change[i]);
			cbox[i].addItemListener(this);
		}
		for(int i=0;i<4;i++)
			pnl.add(cbox[i]);
		lbl=new JLabel("��������� ������ "+money+"�� �Դϴ�.");
		lbl.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,30));
		pnl.add(lbl);
		
		add(pnl);
		setVisible(true);
		
	}
	public void itemStateChanged(ItemEvent e) {
		int select;
		if(e.getStateChange()==ItemEvent.SELECTED) {
			select=1;
			if(e.getItem()==cbox[0])
				money=money+price[0];
			else if(e.getItem()==cbox[1])
				money+=price[1];
			else if(e.getItem()==cbox[2])
				money+=price[2];
			else if(e.getItem()==cbox[3])
				money+=price[3];
		}	
		else {
			select=-1;
			if(e.getItem()==cbox[0])
				money-=price[0];
			else if(e.getItem()==cbox[1])
				money-=price[1];
			else if(e.getItem()==cbox[2])
				money-=price[2];
			else if(e.getItem()==cbox[3])
				money-=price[3];
		}
		
		lbl.setText("��������� ������ "+money+"�� �Դϴ�.");
	}	
	public static void main(String[] args) {
		new PriceCheck();
	}
}
