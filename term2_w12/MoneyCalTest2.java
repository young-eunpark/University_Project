package w12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MoneyCalTest2 extends JFrame{
	MoneyCalTest2(){
		setTitle("화폐 교환");
		setContentPane(new MyPanel2());
		
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel2 extends JPanel{
		Container c=getContentPane();
		MyPanel2()
		{
			setBackground(Color.cyan);
			setLayout(new BorderLayout());
			
			JPanel p1=new JPanel();
			p1.setLayout(new FlowLayout());
			p1.setBackground(Color.cyan);
			JLabel l1=new JLabel("금액");
			JTextField f1=new JTextField(10);
			JButton b=new JButton("계산");
			p1.setSize(300,100);
			p1.add(l1);
			p1.add(f1);
			p1.add(b);
			
			JPanel p2=new JPanel();
			p2.setBackground(Color.cyan);
			p2.setLayout(null);
			String[] mname= {"오만원","만원","천원","500원","100원","50원","10원","1원"};
			int[] price= {50000,10000,1000,500,100,50,10,1};
			JLabel[] lbl=new JLabel[8];
			JTextField[] field= new JTextField[8];
			JCheckBox[] check=new JCheckBox[8];
			
			for(int i=0;i<field.length;i++) {
				lbl[i]=new JLabel(mname[i]);
				lbl[i].setSize(50,20);
				lbl[i].setLocation(50, 5+((i+1)*20));
				lbl[i].setHorizontalAlignment(JLabel.RIGHT);
				p2.add(lbl[i]);
				field[i]=new JTextField(10);
				field[i].setSize(70, 20);
				field[i].setLocation(120, 5+((i+1)*20));
				field[i].setHorizontalAlignment(JTextField.CENTER);
				p2.add(field[i]);
				check[i]=new JCheckBox();
				check[i].setBackground(Color.cyan);
				check[i].setSize(20,20);
				check[i].setLocation(210, 5+((i+1)*20));
				if(i==field.length-1)
					break;
				p2.add(check[i]);
			}
			p2.setSize(300, 200);
			add(p1,BorderLayout.NORTH);
			add(p2,BorderLayout.CENTER);
			
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==b) {
						String s=f1.getText();
						int in=Integer.parseInt(s);
						int in1;
						
						for(int j=0;j<price.length;j++) {	
							if(j==price.length-1){
								in1=in/price[j];
								field[j].setText(Integer.toString(in1));
								break;
							}
							if(!check[j].isSelected()) {
								field[j].setText("0");
								continue;
							}
							in1=in/price[j];
							field[j].setText(Integer.toString(in1));
							if(in1>0)
								in=in%price[j];
						}
					}
				}
			});
		}
	}
	public static void main(String[] args) {
		new MoneyCalTest2();
	}
}
